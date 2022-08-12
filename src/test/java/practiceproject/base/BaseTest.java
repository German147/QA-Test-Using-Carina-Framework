package practiceproject.base;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.junit.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.HomePage;
import practiceproject.pages.InputsPage;

public class BaseTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void testBasePage() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().maximize();
        homePage.open();
        Assert.assertTrue("the internet page is not opened", homePage.isPageOpened());
        homePage.getInputPage();
        InputsPage inputs = new InputsPage(getDriver());
        inputs.fillInTextBox("2");
        


    }
}
