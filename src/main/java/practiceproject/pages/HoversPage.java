package practiceproject.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends AbstractUIObject {

    private AbstractUIObject abstractUIObject;

    @FindBy(className = "figure")
    private WebElement figureBox;
    @FindBy(className = "figCaption")
    private WebElement boxCaption;
    @FindBy(className = "figure")
    private WebElement figure;


    public HoversPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Here the index starts at 1
     *
     * @param index
     */
    public FigureCaption hoverOverFigure(int index) {
        figure.findElements((By) figureBox).get(index-1);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement((By) boxCaption));
    }

    public class FigureCaption{
        private WebElement caption;
        @FindBy(tagName = "h5")
        private ExtendedWebElement header;

        @FindBy(tagName = "a")
        private ExtendedWebElement link;

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
           return caption.isDisplayed();
        }


        public String getTitle(){
            return caption.findElement(header.getBy()).getText();
        }

        public String getLink(){
           return caption.findElement(link.getBy()).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link.getBy()).getText();
        }

    }

}
