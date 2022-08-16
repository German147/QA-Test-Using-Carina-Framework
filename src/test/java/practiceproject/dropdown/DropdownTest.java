package practiceproject.dropdown;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.DropdownPage;
import practiceproject.pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void dropdownTest() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The page was not open");

        DropdownPage dropdownPage = homePage.clickDropdownLink();
        String text = "Option 2";
       dropdownPage.selectFromDropdown(text);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(text),"The option was not selected");
    }
}
