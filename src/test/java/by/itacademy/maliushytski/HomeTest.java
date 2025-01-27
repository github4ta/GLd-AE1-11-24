import by.itacademy.maliushytski.HomePage;
import by.itacademy.maliushytski.HomePageLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testFooterCopyrightText() {
        String expectedFooterCopyrightText = "© 2001—2025 Onlíner";
        Assertions.assertEquals(expectedFooterCopyrightText, homePage.getFooterCopyrightText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
