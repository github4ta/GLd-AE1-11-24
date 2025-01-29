import by.itacademy.maliushytski.AboutCompanyPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class AboutCompanyTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testAboutCompanyPageTitle() {
        String expectedAboutCompanyPageTitle = "Информация о компании";
        HomePage homePage = new HomePage(driver);
        AboutCompanyPage aboutCompanyPage = new AboutCompanyPage(driver);
        homePage.clickAcceptCookies()
                .clickFooterLinkAboutCompany();
        Assertions.assertEquals(expectedAboutCompanyPageTitle, aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
