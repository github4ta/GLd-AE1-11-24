package by.itacademy.maliushytski;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmptyBasketTitle(){
        return driver.findElement(CartPageLocators.YOUR_CART_IS_EMPTY).getText();
    }
}
