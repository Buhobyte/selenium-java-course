package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\Buhomit\\Documents\\DEVSU\\Courses\\selenium-java-course\\resources\\chromedriver.exe");
        fileUploadPage.clickUploadButton();

        Assert.assertEquals(fileUploadPage.getStatusUpload(),"chromedriver.exe","File Upload Incorrect!");



    }

}
