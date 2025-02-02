package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartPageText() {
        return driver.findElement(By.xpath(CartPageLocators.TITLE_CART)).getText();
    }

    public String getYourCartIsEmpty() {
        return driver.findElement(CartPageLocators.YOUR_CART_IS_EMPTY).getText();
    }
}
