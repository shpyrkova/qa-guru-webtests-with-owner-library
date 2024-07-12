package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    @BeforeEach
    public void setUp() {
        WebDriverProvider webDriverProvider = new WebDriverProvider();
        webDriverProvider.setWebConfig();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }

}

