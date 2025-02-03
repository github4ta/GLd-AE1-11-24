package by.onliner;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;
import by.onliner.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        CookiePage cookiePage = new CookiePage(driver);
        cookiePage.clickCookie();
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
    }

    @Test
    public void testLoginIsOpened() {
        LoginPage loginPage = new LoginPage(driver);
        String actual = loginPage.getTitleText();

        Assertions.assertEquals("Вход", actual);
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
