package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("footer copyright contains \"© 2001—2025 Onlíner\"")
    public void test1() {
        HomePage homePage = new HomePage(driver);
        String result = homePage.getFooterCopyrightText();

        Assertions.assertEquals("© 2001—2025 Onlíner", result);
    }

    @Test
    @DisplayName("get headphone section name")
    public void test2() {
        HomePage homePage = new HomePage(driver);
        String result = homePage.getHeadphoneSectionByFullText();

        Assertions.assertEquals("Наушники и гарнитуры", result);
    }

    @Test
    @DisplayName("get headphone section name by partial text")
    public void test3() {
        HomePage homePage = new HomePage(driver);
        String result = homePage.getHeadphoneSectionByPartialText();

        Assertions.assertEquals("Наушники и гарнитуры", result);
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
