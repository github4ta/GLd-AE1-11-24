package by.itacademy.belaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        String xPath = HomePageLocators.BUTTON_LOGIN;
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }
}
