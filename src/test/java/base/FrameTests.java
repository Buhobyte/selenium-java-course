package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() {
        var frameEditorPage = homePage.clickWYSIWYGEditor();
        frameEditorPage.clearTextArea();
        String text1 = "Hello";
        String text2 = "World";
        frameEditorPage.setTextArea(text1);
        frameEditorPage.decreaseIdentation();
        frameEditorPage.setTextArea(text2);

        Assert.assertEquals(frameEditorPage.getTextFromEditor(), text1 + text2, "Incorrect Text iframe");
    }
}
