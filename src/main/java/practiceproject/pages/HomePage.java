package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import practiceproject.pages.InputsPage;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Inputs")
    private ExtendedWebElement inputsLink;

    @FindBy(linkText = "Form Authentication")
    private ExtendedWebElement formAuthenticationLink;

    public LoginPage clickFormAuthentication() {
        formAuthenticationLink.click();
        return new LoginPage(getDriver());
    }

    public InputsPage getInputPage() {
        inputsLink.click();
        return new InputsPage(getDriver());
    }


}
