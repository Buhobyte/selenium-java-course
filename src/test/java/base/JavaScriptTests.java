
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    /************************************************************
     NOTE: We did not add assertions to these tests in the video
     ************************************************************/

    @Test
    public void testScrollToTable() {
        homePage.clickLargeDeepDO().scrollToTable();
//        Thread.sleep(5000); // add exception
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    //Task
    @Test
    public void testDropdownJavascript() throws InterruptedException {
        var dropdownPageJS = homePage.clickDropDownJavascript();
        dropdownPageJS.changeToSelectMultiple();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropdownPageJS.selectFromDropdown(option1);
        dropdownPageJS.selectFromDropdown(option2);

        var selectedOptions = dropdownPageJS.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),2,"Incorrect multiple selects");
        Assert.assertTrue(selectedOptions.contains(option1),"No correct selected");
        Assert.assertTrue(selectedOptions.contains(option2),"No correct selected");

        Thread.sleep(5000);
    }
}
