package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AlertsPage extends AbstractUIObject implements Alert {


    @FindBy(xpath = ".//button[text()='Click for JS Alert']")
    private ExtendedWebElement triggerAlertButton;

    @FindBy(id = "result")
    private ExtendedWebElement results;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void triggerButton() {
        triggerAlertButton.click();
    }

    public String getTextResult() {
        return results.getText();
    }

    @Override
    public void dismiss() {

    }

    @Override
    public void accept() {

    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void sendKeys(String keysToSend) {

    }
}
