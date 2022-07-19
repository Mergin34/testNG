package tests.day16_notations;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Assertions extends TestBase {
    @Test
    public void test01() {
       driver.get("https://www.amazon.com");
       String expectedTitle="Amazon";
       String amazonTitle=driver.getTitle();
        System.out.println(amazonTitle);
        Assert.assertTrue(amazonTitle.contains(expectedTitle));
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isEnabled());
        searchBox.sendKeys("Nutella"+ Keys.ENTER);
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.isDisplayed());
        String actual = sonucYaziElementi.getText();
        String expected = "Nutella";
        Assert.assertTrue(actual.contains(expected));
    }
}
