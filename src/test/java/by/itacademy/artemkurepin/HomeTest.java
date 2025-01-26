package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    public ChromeDriver driver;
    public String actual;
    public final String url = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }

    @Test
    public void testFooterCopyright() {
        HomePage hp = new HomePage(driver);

        actual = hp.getFooterCopyrightText();
        Assertions.assertEquals("© 2001—2025 Onlíner", actual);
    }

}
