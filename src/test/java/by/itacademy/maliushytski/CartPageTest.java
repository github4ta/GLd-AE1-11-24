import by.itacademy.maliushytski.AboutCompanyPage;
import by.itacademy.maliushytski.CartPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPageTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testAboutCompanyPageTitle() {
        String expectedAboutCompanyPageTitle = "Ваша корзина пуста";
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.clickBasketButton();
        Assertions.assertEquals(expectedAboutCompanyPageTitle, cartPage.getEmptyBasketTitle());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
