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

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickcContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public FrameEditorPage clickWYSIWYGEditor() {
        clickLink("WYSIWYG Editor");
        return new FrameEditorPage(driver);
    }

    public FrameNestedPage clickNestedFrames() {
        clickLink("Nested Frames");
        return new FrameNestedPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeDeepDO() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public DropDownJavascriptPage clickDropDownJavascript() {
        clickLink("Dropdown");
        return new DropDownJavascriptPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);

    }

}
