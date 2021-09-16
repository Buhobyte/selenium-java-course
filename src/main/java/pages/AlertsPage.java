package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By results = By.id("result");
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By triggerPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmAlert() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPromptAlert() {
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDimiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_sendInput(String textInput) {
        driver.switchTo().alert().sendKeys(textInput);
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }


}
