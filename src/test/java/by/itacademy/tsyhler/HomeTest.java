package by.itacademy.tsyhler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    private WebDriver driver;

    @BeforeEach
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void footerCopyrightTextIsExist() {
        HomePage homePage = new HomePage(driver);
        String result = homePage.getFooterCopyrightText();
        Assertions.assertEquals("© 2001—2025 Onlíner", result);
    }

    @AfterEach
    public void quitBrowser() {
        driver.quit();
    }
}
