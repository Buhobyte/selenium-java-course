package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        Assert.assertEquals(alertsPage.getResult(),
                "You successfully clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testConfirmAlert() {
        var alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirmAlert();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDimiss();

        Assert.assertEquals(text, "I am a JS Confirm", "Alert Text Incorrect");
    }

    @Test
    public void testPromptAlert() {
        var alertsPAge = homePage.clickAlertsPage();
        alertsPAge.triggerPromptAlert();

        String message = "HELLO WORLD";
        alertsPAge.alert_sendInput(message);
        alertsPAge.alert_clickToAccept();

        Assert.assertEquals(alertsPAge.getResult(), "You entered: " + message);

    }
}
