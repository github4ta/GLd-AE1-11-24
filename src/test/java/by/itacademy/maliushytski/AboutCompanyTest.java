import by.itacademy.maliushytski.AboutCompanyPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {
    private WebDriver driver;
    public HomePage homePage;
    private AboutCompanyPage aboutCompanyPage;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        homePage = new HomePage(driver);
        aboutCompanyPage = new AboutCompanyPage(driver);
    }

    @Test
    public void testAboutCompanyPageTitle() {
        String expectedAboutCompanyPageTitle = "Информация о компании";
        homePage.clickAcceptCookies()
                .clickFooterLinkAboutCompany();
        Assertions.assertEquals(expectedAboutCompanyPageTitle, aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
