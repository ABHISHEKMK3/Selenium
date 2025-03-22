package com.sample;


import com.product.config.ConfigFactory;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLogin() {

      //  FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);

        System.out.println(ConfigFactory.getConfig().browser());


    //    WebDriverManager.chromedriver().setup();
    //    WebDriver driver = new ChromeDriver();
     //   driver.get("https://google.co.in");
     //   driver.quit();
    }
}
