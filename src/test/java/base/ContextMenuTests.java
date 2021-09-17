package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickcContextMenu();
        contextMenuPage.clickRightOnHotPot();

        String msgAlert = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickAccept();

        Assert.assertEquals(msgAlert, "You selected a context menu", "Context clickc over area is incorrect");


    }
}
