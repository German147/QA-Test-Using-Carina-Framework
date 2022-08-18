package practiceproject.keys;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.HomePage;
import practiceproject.pages.HorizontalSlider;
import practiceproject.pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeysTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void testBackSpace() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The page was not open");
        KeyPressesPage keyPage = homePage.clickOnKeyPressesLink();
        keyPage.enterText("A" + Keys.SPACE);
        assertEquals(keyPage.resultTextMessage(), "You entered: SPACE", "You enter the wrong key");
    }

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void testHoldingKeyValue() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The page was not open");
        KeyPressesPage keyPage = homePage.clickOnKeyPressesLink();
        keyPage.enterPi();
        assertEquals(keyPage.resultTextMessage(), "You entered: 4", "You enter the wrong key");

    }

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void testSendingArrowkeys() {
        HomePage homePage = new HomePage(getDriver());
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        HorizontalSlider sliderPage = homePage.clickOnHorizontalSlider();
        sliderPage.clickOnSlider();
        String value = "4";
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
