package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPageTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("card page is opened")
    public void test1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCart();

        CartPage cartPage = new CartPage(driver);
        String result = cartPage.getYourCartIsEmptyText();

        Assertions.assertEquals("Ваша корзина пуста", result);
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
