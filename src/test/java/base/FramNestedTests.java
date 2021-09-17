package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramNestedTests extends BaseTests {

    @Test
    public void testNestedFrame() {
        var frameNestedPage = homePage.clickNestedFrames();

        Assert.assertEquals(frameNestedPage.getLeftFrameText(), "LEFT", "Incorrect Left Frame");
        Assert.assertEquals(frameNestedPage.getBottomFrameText(), "BOTTOM", "Incorrect Bottom Frame");

    }

}
