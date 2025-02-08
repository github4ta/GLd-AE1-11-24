package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiePage {
    private final By BUTTON_COOKIE_LOCATOR = By.xpath("//a[@id='submit-button']");

    private WebDriver driver;

    public CookiePage() {
        this.driver = Singleton.getDriver();
    }

    public void clickCookie(){
        driver.findElement(BUTTON_COOKIE_LOCATOR).click();
    }
}
