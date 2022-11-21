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
    @DisplayName("Проверка баннера на главной странице")
    void checkBannerTest() {
        step("Открываем сайт https://www.beeline.uz/ru/", () -> {
            open("https://www.beeline.uz/ru/");
        });

        step("Проверка видимости баннера", () -> {
            $("#ms-main-banners-banner1").shouldBe(visible);
        });
    }
    @Test
    @DisplayName("Проверка отображения окна авторизации")
    void generatedTest() {
        step("Открываем сайт 'https://www.beeline.uz/ru/'", () ->
                open("https://www.beeline.uz/ru"));

        step("Кликаем на кнопку 'Профиль'", () ->
                $(".logged-out").click());

        step("Проверка видимости окна авторизации", () ->
                $("#pills-register-tab-header").shouldBe(visible));
    }

    @Test
    @DisplayName("Проверка наличия 'title' в 'header'")
    void titleTest() {
        step("Открываем сайт 'https://www.beeline.uz/ru/'", () ->
                open("https://www.beeline.uz/ru/"));

        step("Проверка наличия 'title': 'Официальный сайт сотового оператора Beeline - Узбекистан.'", () -> {
            String expectedTitle = "Официальный сайт сотового оператора Beeline - Узбекистан.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
    @Test
    @DisplayName("Проверка работоспособности страницы 'Тарифные планы'")
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
    @DisplayName("Проверка работоспособности страницы 'Интернет пакеты'")
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
    @DisplayName("Проверка работоспособности страницы 'О нас'")
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
    @DisplayName("Проверка работоспособности страницы 'Вакансии'")
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
    
   
}
