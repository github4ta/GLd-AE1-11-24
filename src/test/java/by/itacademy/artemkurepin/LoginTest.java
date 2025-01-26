package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public ChromeDriver driver;
    public String actual;
    public final String https = "https://www.onliner.by/";

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get(https);
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }
}
