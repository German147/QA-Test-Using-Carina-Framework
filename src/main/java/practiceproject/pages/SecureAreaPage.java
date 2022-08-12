package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends AbstractUIObject {

    @FindBy(id = "flash")
    private ExtendedWebElement statusAlert;
    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }
    public String statusAlertGetText(){
        return statusAlert.getText();
    }
}
