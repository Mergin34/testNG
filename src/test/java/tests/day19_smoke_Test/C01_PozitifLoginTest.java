package tests.day19_smoke_Test;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PozitifLoginTest {
    BrcPage brcPage=new BrcPage();

    @Test
    public void positiveLoginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcPage.ilkLoginButonu.click();
        brcPage.emailAdresButonu.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brcPage.passwordButonu.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        brcPage.ikinciLoginButonu.click();

        String actualUserName=brcPage.loginButonuYok.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUserName,expectedUsername);

        Driver.closeDriver();

    }
}
