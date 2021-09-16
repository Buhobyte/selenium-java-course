package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    private void clickLink(String nameLink) {
        driver.findElement(By.linkText(nameLink)).click();
    }

    public DrownDownPage clickDropdown() {
        clickLink("Dropdown");
        return new DrownDownPage(driver);
    }

    public HoverPage clickHover() {
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public AlertsPage clickAlertsPage() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

}
