package practiceproject.uploadFiles;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import practiceproject.pages.FileUploadPage;
import practiceproject.pages.HomePage;
import practiceproject.service.IOpenHomePage;

import static org.testng.Assert.assertEquals;

public class FileUploadTest implements IAbstractTest, IOpenHomePage {

    @Test
    @MethodOwner(owner = "barreragerman")
    @TestPriority(Priority.P1)
    @TestLabel(name = "FileUploadTest", value = {"Web"})
    public void testFileUpload() {
        HomePage homePage = openHomePage(getDriver());
        FileUploadPage fileUpload = homePage.clickOnFileUpload();
        fileUpload.uploadFile("/Users/solvd/Documents/MyRepositories/carinaFromMaven/carina-from-maven/chromedriver");
        assertEquals(fileUpload.getUploadedFileText(),"chromedriver","The file was not uploaded");
    }

}
