package com.product.config.driver;


import org.openqa.selenium.WebDriver;



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
