package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {
    @Test
    public void amazonTest(){
        driver.get("https:///www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https.bestbuy.com");
    }
    @Test
    public void techpproedTest() {
        driver.get("https.techproeducation.com");
    }
}
