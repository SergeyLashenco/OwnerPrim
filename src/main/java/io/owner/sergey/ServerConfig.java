package io.owner.sergey;

import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {

    @ConverterClass(ServerConverter.class)
    @DefaultValue("google.com:4444")
    Server getServer();
}
