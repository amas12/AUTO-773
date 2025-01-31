package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;



public class GeneratedTests extends TestBase {
    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска по наименованию оферты ")
    void searchValidationOfferTest() {

        step("Открываем сайт onlcmarket", () -> {
            open("https://onlcmarket.ru/");
        });

        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $("#HomeOffersForm_query").setValue("Сетка ЦПВС").pressEnter();
        });

        step("Проверяем отображение", () -> {
            $(".card___StyledCol4-sc-1ka6810-7").shouldHave(text("Сетка ЦПВС"));
        });

        step("Проверяем отображение страницы поиска", () -> {
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldBe(visible).shouldHave(text("Найдено: 1"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска по инн поставщика ")
    void searchValidationInnTest() {
        step("Открываем сайт 'https://onlcmarket.ru/'", () -> {
            open("https://onlcmarket.ru/");
        });

        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $("#HomeOffersForm_providerQuery").setValue("7816552320").pressEnter();
        });

        step("Проверяем отображение", () -> {
            $(".card___StyledCol5-sc-1ka6810-10").shouldHave(text("ООО \"СПИК\""));
        });

        step("Проверяем отображение страницы поиска", () -> {
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldBe(visible).shouldHave(text("Найдено: 2"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска по инн поставщика")
    void searchValidationNameTest() {
        step("Открываем сайт 'https://onlcmarket.ru/'", () -> {
            open("https://onlcmarket.ru/");
        });

        step("Вводим в поиске значение и нажимаем Enter", () -> {
            $("#HomeOffersForm_providerQuery").setValue("\n" +
                    "ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"САНКТ-ПЕТЕРБУРГСКАЯ ИНЖИНИРИНГОВАЯ КОМПАНИЯ\"").pressEnter();
        });

        step("Проверяем отображение", () -> {
            $(".card___StyledCol5-sc-1ka6810-10").shouldHave(text("ООО \"СПИК\""));
        });

        step("Проверяем отображение страницы поиска", () -> {
            $(".sub-top___StyledCol-sc-es4zgy-1").shouldBe(visible).shouldHave(text("Найдено: 2"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска по инн поставщика")
    void cartButtonCheckTest() {
        step("Открываем сайт 'https://onlcmarket.ru/'", () -> {
            open("https://onlcmarket.ru/");
        });

        step("Нажать на кнопку в корзину", () -> {
            $(".add-to-cart___StyledButton-sc-17utrwr-0").click();
        });

        step("Вводим  в инпут значеие", () -> {
            $(".ant-input-number-input").setValue("666");
        });


        step("Проверка кнопки плюс", () -> {
            $(".ant-input-number-handler-up").click();
        });
        step("Проверка кнопки минус", () -> {
            $(".ant-input-number-handler-down").click();
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверка работы поиска по инн поставщика")
    void goToCartPageTest() {
        step("Открываем сайт 'https://onlcmarket.ru/'", () -> {
            open("https://onlcmarket.ru/");
        });

        step("Нажать на кнопку в корзину", () -> {
            $(".add-to-cart___StyledButton-sc-17utrwr-0").click();
        });
        step("Заходим в раздел 'Корзина'", () -> {
            $(".button___StyledSpan-sc-1hic174-3").click();
        });
        step("Проверка кнопки плюс", () -> {
            $(".ant-input-number-handler-up").click();
        });
        step("Проверка кнопки минус", () -> {
            $(".ant-input-number-handler-down").click();
        });
        step("Проверка текста на странице для не авторизованого юзера", () -> {
            $(".right___StyledCol4-sc-orqjop-6").shouldBe(visible).shouldHave(text("Войдите или зарегистрируйтесь, чтобы продолжить оформлять закупку"));
        });
        step("Проверка кнопки минус", () -> {
            $(".clear___StyledButton-sc-12vd6h4-0").click();
        });
        step("Проверить текст модалки ", () -> {
            $(".ant-modal-content").shouldBe(visible).shouldHave(text("Очиcтка корзины"));
        });
        step("Нажать на кнопку Очистить ", () -> {
            $(".modal___StyledButton3-sc-1wrzdg7-3").click();
        });


    }


    /*@Test
    @Description("Autogenerated test")
    @DisplayName("Проверка заголовка главной страницы ")
    void titleTest() {
        step("Open url 'https://onlcmarket.ru/'", () ->
                open("https://onlcmarket.ru/"));

        step("Page title should have text 'Магазин Малых Закупок'", () -> {
            String expectedTitle = "Магазин Малых Закупок";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }*/

}