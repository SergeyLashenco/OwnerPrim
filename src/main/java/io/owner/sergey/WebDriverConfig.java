package io.owner.sergey;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:default.properties",
        "file:~/project.properties"
})
public interface WebDriverConfig extends Config {

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean remote ();


    @Key("webdriver.remote.url")
    URL remoteURL();

    @DefaultValue("CHROME")
    @Key("webdriver.browser.name")
    BrowserName browserName ();

    @Key("webdriver.remote.password")
    String password ();
}
