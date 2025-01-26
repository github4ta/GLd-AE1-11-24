package by.itacademy.primako;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    ChromeDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test

    public void getText() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
        loginPage.getTitleLoginText();
        Assertions.assertEquals("Вход", loginPage.getTitleLoginText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
