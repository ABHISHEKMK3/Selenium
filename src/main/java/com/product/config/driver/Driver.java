package com.product.config.driver;

import com.product.config.ConfigFactory;
import com.product.config.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {

    static WebDriver driver =null;
    public static void intiDriver()
    {
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.co.in");
    }

    public static void quitDriver()
    {
          driver.quit();
    }
}
