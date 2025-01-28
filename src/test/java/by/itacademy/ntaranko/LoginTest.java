package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("footer copyright contains \"© 2001—2025 Onlíner\"")
    public void test1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonLogin();
        String result = loginPage.getTitleLoginText();

        Assertions.assertEquals("Вход", result);
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
