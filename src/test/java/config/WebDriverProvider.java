package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {
    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public void setWebConfig() {
        Configuration.baseUrl = config.getBaseUrl().toString();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        if (config.isRemote()) {
            Configuration.remote = config.getRemoteURL().toString();
        }

    }
}
