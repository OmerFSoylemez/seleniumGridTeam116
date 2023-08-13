package tests;

import manager.DriverManage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;

public class Grid_01 {

    DriverManage driverManage = new DriverManage();

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new ChromeOptions());
        driver.get("https://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    void firefoxTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new FirefoxOptions());
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }

    @Test
    void remoteChromeDriverTest() {

        driver = driverManage.setUpChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    @Test
    void remoteFirefoxDriverTest() {

        driver = driverManage.setUpFirefoxDriver();
        driver.get("https://www.ebay.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
