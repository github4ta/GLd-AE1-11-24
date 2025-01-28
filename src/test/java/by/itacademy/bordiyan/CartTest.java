package by.itacademy.bordiyan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testCartPageIsOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonCart();
        CartPage cartPage = new CartPage(driver);
        String actual = cartPage.getYourArtIsEmptyText();
        Assertions.assertEquals("Ваша корзина пуста", actual);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
