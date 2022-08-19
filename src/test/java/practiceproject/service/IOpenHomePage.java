package practiceproject.service;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import practiceproject.pages.HomePage;

public interface IOpenHomePage {

    default HomePage openHomePage(WebDriver driver){
        HomePage homePage = new HomePage(driver);
        driver.manage().window().fullscreen();
        homePage.open();
        Assert.assertTrue("The page was not open - barreragerman.info", homePage.isPageOpened());
        return homePage;
    }
}
