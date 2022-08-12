package practiceproject.login;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.junit.Assert;
import org.testng.annotations.Test;
import practiceproject.pages.HomePage;
import practiceproject.pages.LoginPage;
import practiceproject.pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest implements IAbstractTest {
    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void logingTestPage() {
        HomePage homePage = new HomePage(getDriver());
        getDriver().manage().window().fullscreen();
        homePage.open();
        Assert.assertTrue("The page was not open - barreragerman.info", homePage.isPageOpened());
        LoginPage loginForm = homePage.clickFormAuthentication();
        loginForm.setUsernameText("tomsmith");
        loginForm.setPasswordText("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginForm.clickLoginButton();
        assertTrue(secureAreaPage.statusAlertGetText().contains("You logged into a secure area!"),"The text is not shown");

    }
}
