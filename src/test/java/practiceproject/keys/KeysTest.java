package practiceproject.keys;

import com.qaprosoft.carina.core.foundation.IAbstractTest;

import com.zebrunner.agent.core.annotation.Priority;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.TestPriority;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.HomePage;
import practiceproject.pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(com.zebrunner.carina.core.registrar.tag.Priority.P1)
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
}
