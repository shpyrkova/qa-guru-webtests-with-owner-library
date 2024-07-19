package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Owner("surkova")
@Feature("Поиск магазинов Starbucks")
public class StarbucksTests extends TestBase {

    @Test
    @Tags({@Tag("web"), @Tag("major")})
    @DisplayName("Поиск магазина Starbucks по названию локации")
    void searchStoreByLocationNameTest() {
        step("Открыть главную страницу Starbucks", () -> {
                    open("");
        });
        step("Нажать Find a store", () -> {
            $(byText("Find a store")).click();
        });
        step("Ввести название локации магазина Royal Garden Pattaya", () -> {
            $("[data-e2e='searchTermInput']").setValue("Royal Garden Pattaya");
        });
        step("Нажать на кнопку поиска", () -> {
            $("[data-e2e='submitSearchTermButton']").click();
        });
        step("Убедиться, что появилась активная карточка магазина Royal Garden Pattaya", () -> {
            $("[data-e2e='activeCard']").shouldHave(text("Royal Garden Pattaya"));
        });
    }

}
