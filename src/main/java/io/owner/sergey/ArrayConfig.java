package io.owner.sergey;

import org.aeonbits.owner.Config;

import java.util.List;

public interface ArrayConfig extends Config {

    @Separator(";")
    @DefaultValue("apple;banana;orange")
    List<String> fruits();
}
