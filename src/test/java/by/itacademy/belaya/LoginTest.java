package by.itacademy.belaya;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Форма для входа содержит текст Вход")
    public void testLoginText() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickButtonLogin();
        Assertions.assertEquals("Вход", loginPage.getTitleLoginText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
