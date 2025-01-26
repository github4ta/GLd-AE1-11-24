package by.itacademy.belaya;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("footer copyright text содержит © 2001—2025 Onlíner")
    public void testFooterCopyrightText() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("© 2001—2025 Onlíner", homePage.getFooterCopyrightText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
