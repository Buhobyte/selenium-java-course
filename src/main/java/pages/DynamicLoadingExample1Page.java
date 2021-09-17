package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loading = By.cssSelector("#loading");
    private By loadedText = By.cssSelector("#finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));

        //Fluid wait
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5)) //waiting MAX 2 seconds
                .pollingEvery(Duration.ofSeconds(2)) // waiting MIN 2 seconds
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loading)
        ));

    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }


}
