package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiePage {
    private final By BUTTON_COOKIE_LOCATOR = By.xpath("//a[@id='submit-button']");

    private WebDriver driver;

    public CookiePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookie(){
        driver.findElement(BUTTON_COOKIE_LOCATOR).click();
    }
}
