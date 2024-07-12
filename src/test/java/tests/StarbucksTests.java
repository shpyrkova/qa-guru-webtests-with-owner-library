package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StarbucksTests extends TestBase {

    @Test
    @DisplayName("Поиск магазина Starbucks по названию локации")
    void searchStoreByName() {
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
            $("[data-e2e='searchTermInput']").setValue("Royal Garden Pattaya");
        });
    }

}
