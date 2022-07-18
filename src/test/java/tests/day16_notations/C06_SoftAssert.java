package tests.day16_notations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C06_SoftAssert extends TestBase {
    @Test(groups = "grup2")
    public void test01() {
        SoftAssert softAssert=new SoftAssert();
        driver.get("https://www.amazon.com");
        String expectedTitle="Amazon";
        String amazonTitle=driver.getTitle();
        System.out.println(amazonTitle);
        softAssert.assertTrue(amazonTitle.contains(expectedTitle),"title amazon icermiyor");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(searchBox.isEnabled(),"arama kutusuna erisilemiyor");
        searchBox.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed(),"arama yapilamadi");
        String actual = sonucYaziElementi.getText();
        String expected = "Nutella";
        softAssert.assertTrue(actual.contains(expected),"sonuc yazisi icermiyor");
        softAssert.assertAll();
        System.out.println("assertion'lardan fail olan olursa, burasi calismaz");
    }
}
