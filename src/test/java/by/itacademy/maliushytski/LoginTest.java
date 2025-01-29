import by.itacademy.maliushytski.HomePage;
import by.itacademy.maliushytski.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

    }

    @Test
    public void testFooterCopyrightText() {
        String expectedEntryName = "Вход";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
        Assertions.assertEquals(expectedEntryName, loginPage.getTitleLoginText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
