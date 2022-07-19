package tests.day19_smoke_Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {
    BrcPage brcPage=new BrcPage();
    @Test
    public void yanlisSifre() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        Thread.sleep(2000);
        brcPage.ilkLoginButonu.click();
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        brcPage.ikinciLoginButonu.click();
        Assert.assertTrue(brcPage.ilkLoginButonu.isDisplayed());
        Driver.closeDriver();
    }

}
