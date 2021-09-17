package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameEditorPage {

    public WebDriver driver;
    String idIframe = "mce_0_ifr";
    private By areaiFrame = By.id("tinymce");
    private By decreaseSelector = By.cssSelector("#content > div > div > div.tox-editor-container > div.tox-editor-header > div.tox-toolbar-overlord > div > div:nth-child(5) > button:nth-child(2)");

    FrameEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditorArea();
        driver.findElement(areaiFrame).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditorArea();
        driver.findElement(areaiFrame).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIdentation() {
        driver.findElement(decreaseSelector).click();
    }

    private void switchToEditorArea() {
        driver.switchTo().frame(idIframe);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextFromEditor() {
        switchToEditorArea();
        String text = driver.findElement(areaiFrame).getText();
        switchToMainArea();
        return text;
    }
}
