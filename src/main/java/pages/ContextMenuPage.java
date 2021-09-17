package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotPot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRightOnHotPot() {
        WebElement hotPotArea = driver.findElement(hotPot);
        Actions actions = new Actions(driver);
        actions.contextClick(hotPotArea).perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_clickAccept() {
        driver.switchTo().alert().accept();
    }


}
