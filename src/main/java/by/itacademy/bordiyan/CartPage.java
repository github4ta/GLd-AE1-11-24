package by.itacademy.bordiyan;

import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getYourArtIsEmptyText() {
        return driver.findElement(CartPageLocators.YOUR_ART_IS_EMPTY_TEXT).getText();
    }

}
