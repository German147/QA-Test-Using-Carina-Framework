package practiceproject.forgotPassword;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.ForgotPasswordPage;
import practiceproject.pages.HomePage;

public class ForgotPasswordTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void forgotPaswordTest() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        /**
         * I must open the page using IAbstractTest and do the assertion
         */
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "The page was not open");

        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("myFirstTestAlone@tau.com");
        forgotPasswordPage.clickRetrieveButton();
        String errorText = forgotPasswordPage.getInternalServerErrorText();
        Assert.assertTrue(errorText.contains("Internal Server Error"),"The email was not retrieved");
    }
}
