package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractUIObject {

    @FindBy(id = "username")
    private ExtendedWebElement userNameField;
    @FindBy(id = "password")
    private ExtendedWebElement passwordField;

    @FindBy(css = "#login button")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUsernameText(String username) {
       userNameField.type(username);
    }
    public void setPasswordText(String password) {
        passwordField.type(password);
    }

    public SecureAreaPage clickLoginButton(){
        loginButton.click();
        return new SecureAreaPage(getDriver());
    }

}
