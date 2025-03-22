package com.product.config.converters;


import com.product.config.enums.BrowserRunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;


public class StringToBrowserRunModeConverter implements Converter<BrowserRunModeType> {


    @Override
    public BrowserRunModeType convert(Method method, String runMode) {

        return BrowserRunModeType.valueOf(runMode.toUpperCase());
    }
}
