package by.itacademy.alex.linnik.test;

import by.itacademy.aliaksandr.linnik.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

class HomeTest {

    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.onliner.by/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка на наличие текста © 2001—2025 Onlíner")
    public void footerCopyrightText() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("© 2001—2025 Onlíner", homePage.inscription2001_2025());
    }
}


