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
    @Test
    @DisplayName("Checking the Tariff Plans section")
    void tariffPlansTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Заходим в раздел 'Тарифные планы'", () -> {
            $$("span[class='label-nav notoSa main__menu-item']").first().click();
        });

        step("Проверка отображения страницы", () -> {
            $(".notoSa.text-center.h2_space").shouldHave(text("Тарифные планы"));
        });
    }

    @Test
    @DisplayName("Checking the Internet packages section")
    void internetPackagesTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Заходим в раздел 'Интернет пакеты'", () -> {
            $("a[href='https://beeline.uz/ru/products/internet-paketi?utm_source=site&utm_medium=cust_exp&utm_campaign=paketi_ru']").click();
        });

        step("Проверка отображения страницы", () -> {
            $("div[id='tarif-list1'] h2[class='notoSa text-center h2_space']").shouldHave(text("Однодневные интернет-пакеты"));
        });
    }

    @Test
    @DisplayName("Checking page 'About'")
    void aboutPageTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Заходим во вкладку 'О нас'", () -> {

            $("a[href='/ru/about']").click();
        });

        step("Проверка отображения страницы", () -> {
            $(".has-edit-button").shouldHave(text("VEON – глобальный провайдер телекоммуникационных и интернет-услуг с более чем 217 млн абонентов в 9 странах мира. Его акции котируются на фондовых рынках NASDAQ и Euronext Amsterdam."));
        });
    }
    @Test
    @DisplayName("Checking page 'Vacancies'")
    void vacanciesPageTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Заходим во вкладку 'Вакансии'", () -> {

            $("a[href='/ru/vacancies']").click();
        });

        step("Проверка отображения страницы", () -> {
            $("div[class='col-12'] h2[class='notoSa text-left h2_space']").shouldHave(text("Вакансии"));
        });
    }

    @Test
    @DisplayName("Checking page 'Management company'")
    void managementCompanyPageTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Заходим во вкладку 'Руководство'", () -> {

            $("a[href='/ru/about/managementcompany']").click();
        });

        step("Проверка отображения страницы", () -> {
            $("#killerfeature1").shouldHave(text("Генеральный директор"));
        });
    }
    @Test
    @DisplayName("Checking page 'Contacts'")
    void contactsPageTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Нажимаем на иконку техподдержки", () -> {

            $("a[href='/ru/about/contacts']").click();
        });

        step("Проверка отображения окна техподдержки", () -> {
            $("h2[class='notoSa text-left h2_space']").shouldHave(text("Форма обратной связи"));
        });
    }
    
}
