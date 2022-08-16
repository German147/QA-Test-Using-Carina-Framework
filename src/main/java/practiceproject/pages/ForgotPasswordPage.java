package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends AbstractUIObject {

    @FindBy(id = "email")
    private ExtendedWebElement email;

    @FindBy(id = "form_submit")
    private ExtendedWebElement retrieveButton;

    @FindBy(tagName = "h1")
    private ExtendedWebElement internalServerError;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String emailText){
        email.type(emailText);
    }

    public void clickRetrieveButton(){
        retrieveButton.click();
    }

    public String getInternalServerErrorText(){
        return internalServerError.getText();
    }

}
