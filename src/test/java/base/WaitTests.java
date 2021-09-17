package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests{

    @Test
    public void testUntilHiddenLoading(){
        var dynamicLoadingExample1Page = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingExample1Page.clickStartButton();

        String loadedText = dynamicLoadingExample1Page.getLoadedText();
        Assert.assertEquals(loadedText,"Hello World!","Error loaded after clickStart");
    }

    @Test
    public void testUntilTextVisible() {
        var dynamicLoadingExample2Page = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2Page.clickStartButton();

        String loadedText = dynamicLoadingExample2Page.getLoadedText();
        Assert.assertEquals(loadedText, "Hello World!", "Error loaded after clickStart");
    }
}
