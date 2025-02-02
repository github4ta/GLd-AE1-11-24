package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuAppPage {
    private WebDriver driver;

    public HerokuAppPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveAddButton() {
        driver.findElement(HerokuAppLocators.BUTTON_REMOVE_ADD).click();
    }

    public void waitForVisibilityOfElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
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
