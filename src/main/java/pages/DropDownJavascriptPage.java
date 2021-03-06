package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownJavascriptPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownJavascriptPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeToSelectMultiple() {
        WebElement selectElement = driver.findElement(dropdown);
        String javascript = "arguments[0].setAttribute('multiple', '')";
        var jsExecutor = (JavascriptExecutor) driver;

        jsExecutor.executeScript(javascript, selectElement);
    }


    public void selectFromDropdown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));

    }
}
