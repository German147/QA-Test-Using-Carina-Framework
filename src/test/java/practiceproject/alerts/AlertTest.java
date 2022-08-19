package practiceproject.alerts;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import practiceproject.pages.AlertsPage;
import practiceproject.pages.HomePage;
import practiceproject.service.IOpenHomePage;

import static org.testng.Assert.assertEquals;

public class AlertTest implements IAbstractTest, IOpenHomePage {
    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "parsingSingleToCarina", value = {"web", "regression"})
    public void testAlerts() {
        HomePage homePage = openHomePage(getDriver());
        AlertsPage alertsPage = homePage.clickOnAlertLink();
        alertsPage.triggerButton();
        alertsPage.accept();
        assertEquals(alertsPage.getTextResult(),
                "You successfully clicked an alert",
                "The result text is incorrect");
    }
}
