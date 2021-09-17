package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameNestedPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameBotton = "frame-bottom";
    private By body = By.tagName("body");

    public FrameNestedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText() {
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
        String textLeft = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return textLeft;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame(frameBotton);
        String text = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return text;
    }
}
