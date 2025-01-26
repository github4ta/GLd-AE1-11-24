package by.itacademy.bordiyan;

import by.itacademy.bordiyan.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    ChromeDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Проверка на наличие текста © 2001—2025 Onlíner")
    public void getFooterCopyrightText() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("© 2001—2025 Onlíner", homePage.getFooterCopyrightText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
