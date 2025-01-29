import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testFooterCopyrightText() {
        String expectedFooterCopyrightText = "© 2001—2025 Onlíner";
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals(expectedFooterCopyrightText, homePage.getFooterCopyrightText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
