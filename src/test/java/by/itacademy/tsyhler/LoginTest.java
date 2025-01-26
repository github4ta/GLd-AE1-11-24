package by.itacademy.tsyhler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void logFormIsExist() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.clickButtonLogin();
        String result = loginPage.getTitleLoginText();
        Assertions.assertEquals("Вход", result);
    }

    @AfterEach
    public void quitBrowser() {
        driver.quit();
    }
}
