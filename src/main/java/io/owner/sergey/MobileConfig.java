package io.owner.sergey;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface MobileConfig extends Config {

    @Key("mobile.platform.name")
    String platformName();

    @Key("mobile.platform.version")
    String platformVersion();

    @Key("mobile.device.name")
    String deviceName();

    @Key("mobile.app.location")
    URL appLocation();
}
