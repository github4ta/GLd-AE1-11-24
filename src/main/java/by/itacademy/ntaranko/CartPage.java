package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getYourCartIsEmptyText() {
        return driver.findElement(By.xpath(CartPageLocators.YOUR_CARD_IS_EMPTY_TEXT)).getText();
    }
}
