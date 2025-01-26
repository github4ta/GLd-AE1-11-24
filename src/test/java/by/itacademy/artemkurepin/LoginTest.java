package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public ChromeDriver driver;
    public String actual;
    public final String https = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(https);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }

    @Test
    public void testLoginWindowIsOpend() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.clickButtonLogin();
        actual = lp.getTitleLoginText();
        Assertions.assertEquals("Вход", actual);

    }
}
