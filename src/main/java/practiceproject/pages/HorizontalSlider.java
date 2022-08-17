package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HorizontalSlider extends AbstractUIObject {

    @FindBy(id = "range")
    private ExtendedWebElement sliderValue;

    @FindBy(css = ".sliderContainer input")
    private ExtendedWebElement slider;

    public HorizontalSlider(WebDriver driver) {
        super(driver);
    }

    public void clickOnSlider() {
        slider.click();
    }

    public void setSliderValue(String value) {
        while(!getSliderValue().equals(value)){
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public String getSliderValue(){
        return sliderValue.getText();
    }
}
