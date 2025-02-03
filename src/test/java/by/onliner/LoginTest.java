package by.onliner;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;
import by.onliner.pages.LoginPage;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    @BeforeEach
    public void beforeEach() {
        HomePage homePage = new HomePage();
        homePage.open();

        CookiePage cookiePage = new CookiePage();
        cookiePage.clickCookie();

        homePage = new HomePage();
        homePage.clickButtonLogin();
    }

    @Test
    public void testLoginIsOpened() {
        LoginPage loginPage = new LoginPage();
        String actual = loginPage.getTitleText();

        Assertions.assertEquals("Вход", actual);
    }

    @AfterEach
    public void tearsDown() {
        Singleton.quit();
    }
}
