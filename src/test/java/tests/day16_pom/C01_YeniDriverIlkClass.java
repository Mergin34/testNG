package tests.day16_pom;

import org.testng.annotations.Test;
import utilities.Driver;


public class C01_YeniDriverIlkClass {
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
