package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends AbstractUIObject {

    @FindBy(id = "target")
    private ExtendedWebElement inputField;
    @FindBy(id = "result")
    private ExtendedWebElement resultText;

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text) {
        inputField.type(text);
    }

    public String resultTextMessage() {
        return resultText.getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p") + " = 3,14");
    }
}
