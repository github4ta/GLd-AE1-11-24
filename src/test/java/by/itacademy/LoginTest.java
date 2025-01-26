package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    ChromeDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Проверка на наличие текста Вход")
    public void getText() {
        LoginPage page = new LoginPage(driver);
        HomePage page1 = new HomePage(driver);
        page1.clickButtonLogin();
        page.getTitleLoginText();
        Assertions.assertEquals("Вход", page.getTitleLoginText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}


