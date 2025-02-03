package by.onliner;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        CookiePage cookiePage = new CookiePage(driver);
        cookiePage.clickCookie();
        driver.manage().window().maximize();
    }

    @Test
    public void testLoginIsOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();

        String actual = "";
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
