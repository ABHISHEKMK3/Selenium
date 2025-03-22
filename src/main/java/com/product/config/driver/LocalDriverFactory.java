package com.product.config.driver;

import com.product.config.ConfigFactory;
import com.product.config.enums.BrowserType;
import com.product.config.manager.ChromeManager;
import com.product.config.manager.EdgeManager;
import com.product.config.manager.FirefoxManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {



    public LocalDriverFactory()
    {

    }

    public static WebDriver getDriver()
    {
         WebDriver driver = null;
        if(isBrowserChrome())
        {
            driver = ChromeManager.getDriver();
        }
        else if(isBrowserFirefox())
        {
             driver   = FirefoxManager.getDriver();
        }
        else {
           driver =   EdgeManager.getDriver();
        }

return driver;
    }

    private static boolean isBrowserFirefox() {
        return ConfigFactory.getConfig().browser() == BrowserType.FIREFOX;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
