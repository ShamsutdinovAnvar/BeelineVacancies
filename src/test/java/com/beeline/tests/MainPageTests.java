package com.beeline.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTests extends TestBase {
   @Test
    @DisplayName("Checking the main page banner")
    void checkBannerTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("check banner", () -> {
            $("#ms-main-banners-banner1").shouldBe(visible);
        });
    }
 @Test
    @DisplayName("Login modal form should appear on main page")
    void generatedTest() {
        step("Open url 'https://www.beeline.uz/ru/'", () ->
                open("https://www.beeline.uz/ru"));

        step("Click on Profile button", () ->
                $(".logged-out").click());

        step("Login modal should be visible", () ->
                $("#pills-register-tab-header").shouldBe(visible));
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.beeline.uz/ru/'", () ->
                open("https://www.beeline.uz/ru/"));

        step("Page title should have text 'Официальный сайт сотового оператора Beeline - Узбекистан.'", () -> {
            String expectedTitle = "Официальный сайт сотового оператора Beeline - Узбекистан.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
