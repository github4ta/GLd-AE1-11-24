package by.itacademy.alex.linnik.test;

import by.itacademy.aliaksandr.linnik.HomePage;
import by.itacademy.aliaksandr.linnik.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {

    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.onliner.by/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }


    @Test
    @DisplayName("Проверка на наличие текста Ввод")
    public void loginText() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.loginButton();
        Assertions.assertEquals("Вход", loginPage.getTitleLoginText());
    }
}