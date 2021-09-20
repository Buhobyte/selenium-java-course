package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTests {

    @Test
    public void TestNewWindows() throws InterruptedException {
        var buttonPage = homePage.clickDynamicLoading().clickRightControlOnExample2();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
