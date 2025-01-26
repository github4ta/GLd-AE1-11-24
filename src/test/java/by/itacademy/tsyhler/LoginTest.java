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
        HomePageLocators homePageLocators = new HomePageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        homePageLocators.clickButtonLogin();
        String result = loginPageLocators.getTitleLoginText();
        Assertions.assertEquals("Вход", result);
    }

    @AfterEach
    public void quitBrowser() {
        driver.quit();
    }
}
