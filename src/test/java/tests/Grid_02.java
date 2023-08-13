package tests;

import manager.DriverManage;
import org.testng.annotations.*;

import static manager.DriverManage.driver;
import static manager.DriverManage.setDriver;

public class Grid_02 {

    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser")String browser) {

        setDriver("grid_firefox");
    }

    @Test
    void test01 () {

        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @AfterTest
    void afterTest() {
        DriverManage.CloseDriver();
    }
}
