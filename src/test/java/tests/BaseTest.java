package tests;

import common.PageManager;
import driver.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {
    protected static PageManager pageManager;
    //    protected SoftAssert softAssert;
    @BeforeClass
    public static void setUp() {
        pageManager = new PageManager();
    }
    //    @BeforeMethod
//    public void openDriver() {
//        Selenide.open();
//    }

//    @AfterMethod
//    public void clearCookies() {
//        DriverFactory.clearCookies();
//    }

    @AfterClass
    public static void tearDown() {

        DriverFactory.close();
    }
}