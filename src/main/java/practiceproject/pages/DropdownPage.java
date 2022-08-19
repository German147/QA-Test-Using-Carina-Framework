package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends AbstractUIObject {
    /**
     * In order to click a linktext I have to use an ExtendedWebElement
     */
    @FindBy(id = "dropdown")
    private ExtendedWebElement dropdown;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFromDropdown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    /**
     * here I create a list of the selected Options from the dropdown and then map it into a stream and create a list by
     * its text.
     * @return a list of texts of the selected options
     */
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    /**
<<<<<<< HEAD
     * In order to select an option from the dropdown I have to adapt argument to .getElement()
=======
     * In order to select an option from the dropdown I have to adapt argument to .getElement() in order to make it work.
>>>>>>> DropDownElement
     * @return
     */
    private Select findDropdownElement() {
        return new Select(dropdown.getElement());
    }


}
