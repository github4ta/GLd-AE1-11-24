package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HerokuAppPage {
    private WebDriver driver;

    public HerokuAppPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveButton() {
        driver.findElement(HerokuAppLocators.BUTTON_REMOVE).click();
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }
}
