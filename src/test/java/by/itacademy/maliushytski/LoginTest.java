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
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void testFooterCopyrightText() {
        String expectedEntryName = "Вход";
        homePage.clickButtonLogin();
        Assertions.assertEquals(expectedEntryName, loginPage.getTitleLoginText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
