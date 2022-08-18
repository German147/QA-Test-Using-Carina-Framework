package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Inputs")
    private ExtendedWebElement inputsLink;

    @FindBy(linkText = "Form Authentication")
    private ExtendedWebElement formAuthenticationLink;

    @FindBy(linkText = "Dropdown")
    private ExtendedWebElement dropdown;

    @FindBy(linkText = "Forgot Password")
    private ExtendedWebElement forgotPasswordLink;

    @FindBy(linkText = "Hovers")
    private ExtendedWebElement hoversPageLink;

    @FindBy(linkText = "Key Presses")
    private ExtendedWebElement keyPressesLink;

    @FindBy(linkText = "Horizontal Slider")
    private ExtendedWebElement horizontalSlider;

    @FindBy(linkText = "JavaScript Alerts")
    private ExtendedWebElement alertLink;

    public LoginPage clickFormAuthentication() {
        formAuthenticationLink.click();
        return new LoginPage(getDriver());
    }

    public InputsPage getInputPage() {
        inputsLink.click();
        return new InputsPage(getDriver());
    }

    public DropdownPage clickDropdownLink() {
        dropdown.click();
        return new DropdownPage(getDriver());
    }

    public ForgotPasswordPage clickForgotPassword() {
        forgotPasswordLink.click();
        return new ForgotPasswordPage(getDriver());
    }

    public HoversPage clickOnHoversLink() {
        hoversPageLink.click();
        return new HoversPage(getDriver());
    }

    public KeyPressesPage clickOnKeyPressesLink() {
        keyPressesLink.click();
        return new KeyPressesPage(getDriver());
    }

    public HorizontalSlider clickOnHorizontalSlider() {
        horizontalSlider.click();
        return new HorizontalSlider(getDriver());
    }

    public AlertsPage clickOnAlertLink(){
        alertLink.click();
        return new AlertsPage(getDriver());
    }


}
