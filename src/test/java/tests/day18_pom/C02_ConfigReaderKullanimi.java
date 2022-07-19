package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        facebookPage.cookiesElement.click();
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("facebookWrongUsername"));
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("facebookWrongPassword"));
        facebookPage.loginTusu.click();
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();

    }
}
