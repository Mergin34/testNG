package tests.day17_pom;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void test01() {
        AmazonPage amazonPage= new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String expected="nutella";
        Assert.assertTrue(actualSonuc.contains(expected));
        Driver.closeDriver();
    }
}
