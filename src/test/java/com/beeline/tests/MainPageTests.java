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

}
