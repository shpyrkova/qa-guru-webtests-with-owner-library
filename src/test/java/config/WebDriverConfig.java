package config;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.starbucks.com/")
    URL getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("122.0")
    String getBrowserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteURL();
}