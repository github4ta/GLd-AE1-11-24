import by.itacademy.maliushytski.AboutCompanyPage;
import by.itacademy.maliushytski.HomePage;
import by.itacademy.maliushytski.HomePageLocators;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class AboutCompanyTest {
    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage homePage;
    private AboutCompanyPage aboutCompanyPage;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.onliner.by/");
        homePage = new HomePage(driver);
        aboutCompanyPage = new AboutCompanyPage(driver);
    }

    @Test
    public void testAboutCompanyPageTitle() throws InterruptedException {
        String expectedAboutCompanyPageTitle = "Информация о компании";
        homePage.clickAcceptCookies();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.returnByLocator(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY)));
            wait.until(ExpectedConditions.elementToBeClickable(HomePage.returnByLocator(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY)));
            homePage.clickFooterLinkAboutCompany();
        } catch (StaleElementReferenceException e) {
            driver.navigate().refresh();
            By locator = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
            WebElement element = driver.findElement(locator);
            element.click();
        }
        Assertions.assertEquals(expectedAboutCompanyPageTitle, aboutCompanyPage.getTitleAboutCompanyText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
