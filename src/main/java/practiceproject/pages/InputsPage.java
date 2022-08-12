package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends AbstractUIObject {

    @FindBy(xpath = ".//input")
    private WebElement inputText;
    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void fillInTextBox(String number){
        inputText.sendKeys(number);
    }

}
