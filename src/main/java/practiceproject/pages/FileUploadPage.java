package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends AbstractUIObject {

    @FindBy(id = "file-upload")
    private ExtendedWebElement inputField;

    @FindBy(id = "file-submit")
    private ExtendedWebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private ExtendedWebElement uploadedFile;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton(){
        uploadButton.click();
    }
    public void uploadFile(String absolutePath){
        inputField.type(absolutePath);
        clickUploadButton();
    }

    public String getUploadedFileText(){
        return uploadedFile.getText();
    }
}
