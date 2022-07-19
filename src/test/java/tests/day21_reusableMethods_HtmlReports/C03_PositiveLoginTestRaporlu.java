package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PositiveLoginTestRaporlu extends TestBaseRapor {
    BrcPage brcPage = new BrcPage();

    @Test
    public void positiveLoginTest() {
        extentTest = extentReports.createTest("Pozitif Login", "Gecerli username ve sifre ile giris yapabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        brcPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tiklandi");
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("gecerli email yazildi");
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("gecerli password yazildi");
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna basildi");

      // String actualUsername = brcPage.kullaniciProfilIsmi.getText();
      // String expectedUsername = ConfigReader.getProperty("brcValidUsername");
      // Assert.assertEquals(actualUsername, expectedUsername);
      // extentTest.pass("kullanici basarili sekilde giris yapti");
        Driver.closeDriver();

    }
}
