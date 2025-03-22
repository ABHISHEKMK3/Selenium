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

        System.out.println(ConfigFactory.getConfig().browser());




    }
}
