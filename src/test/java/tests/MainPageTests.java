package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("Главная страница Google")
@Story("Проверка отображения базовых элементов")
public class MainPageTests extends TestBase {

    @Test
    @AllureId("1163")
    @Tag("smoke")
    @DisplayName("Проверка, что логотип существует")
    void logoTests() {
        step("Открываем google.com", () ->
            open("http://google.com"));

        step("Проверяем, что логотип загрузился", () ->
            $("#hplogo").shouldBe(visible));
    }
}
