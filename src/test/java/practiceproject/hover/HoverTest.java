package practiceproject.hover;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import practiceproject.pages.HomePage;
import practiceproject.pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void hovertingTest() {

        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        assertTrue(homePage.isPageOpened(), "The page was not open");
        HoversPage hoversPage = homePage.clickOnHoversLink();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"The caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","The caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile","The link title is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"The link is incorrect");
    }
}
