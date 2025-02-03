package by.onliner;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://money.onliner.by/");
        driver.manage().window().maximize();
        CookiePage cookiePage = new CookiePage(driver);
        cookiePage.clickCookie();
    }

    @Test
    public void testPageOpened() {
        HomePage homePage = new HomePage(driver);
        String actual = homePage.getTextCopyright();
        Assertions.assertEquals("© 2001—2025 Onlíner", actual);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
