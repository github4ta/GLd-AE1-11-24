package by.itacademy.bordiyan;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Проверка на наличие текста Вход")
    public void getText1() {
        LoginPage page = new LoginPage(driver);
        HomePage page1 = new HomePage(driver);
        page1.clickButtonLogin();
        page.getTitleLoginText();
        Assertions.assertEquals("Вход", page.getTitleLoginText());
    }

    @Test
    public void getText2() {
        LoginPage page = new LoginPage(driver);
        Assertions.assertEquals("ВСЕ РАЗДЕЛЫ ФОРУМА", page.getAllForums());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}

