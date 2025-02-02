package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CartTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Текст соответствует надписи КОРЗИНА")
    public void getText() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonCart();
        CartPage cartPage = new CartPage(driver);
        Assertions.assertEquals("Корзина", cartPage.getCartPageText());
    }

    @Test
    @DisplayName("Текст соответствует надписи Ваша корзина пуста")
    public void getText1(){
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonCart();
        CartPage cartPage = new CartPage(driver);
        Assertions.assertEquals("Ваша корзина пуста",cartPage.getYourCartIsEmpty());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
