package base;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropDownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
