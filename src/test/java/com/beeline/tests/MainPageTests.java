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
    @DisplayName("Login modal form should appear on main page")
    void generatedTest() {
        step("Open url 'https://habr.com/'", () ->
                open("https://habr.com/"));

        step("Click on Profile button", () ->
                $("[data-test-id=menu-toggle-guest]").click());

        step("Login modal should be visible", () ->
                $(".tm-user-menu").shouldBe(visible));
    }

}
