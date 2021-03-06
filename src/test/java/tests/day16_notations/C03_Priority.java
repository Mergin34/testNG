package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test(priority = -5)
    public void amazonTest(){
        driver.get("https:///www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = -2)
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test(groups = "grup1")
    public void techpproedTest() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
