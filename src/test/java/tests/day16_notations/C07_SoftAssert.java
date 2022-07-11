package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.List;

public class C07_SoftAssert extends TestBase {
    @Test
    public void test01() {
        driver.get("http://zero.webappsecurity.com/");
        WebElement signInButton=driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButton.click();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        WebElement signIn=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        signIn.click();
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency'")).click();
        WebElement ddo=driver.findElement(By.xpath("//select[@name='currency']"));
        Select select=new Select(ddo);
        select.selectByVisibleText("Eurozone (euro)");
        SoftAssert softAssert=new SoftAssert();
        String co=select.getFirstSelectedOption().getText();
        String expected="Eurozone (Euro)";
        softAssert.assertEquals(co,expected,"choises option isn't available ");
        List<WebElement> optionsList= select.getOptions();
    }
}
