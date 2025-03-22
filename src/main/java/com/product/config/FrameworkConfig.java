package com.product.config;

import com.product.config.converters.StringToBrowserTypeConverter;
import com.product.config.enums.BrowserRemoteModeType;
import com.product.config.enums.BrowserRunModeType;
import com.product.config.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties", "system:env", "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("browserRunMode")
    BrowserRunModeType  browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();




}
