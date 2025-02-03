package by.itacademy.linnik;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPage {
    private WebDriver driver;

    public DynamicPage(WebDriverWait wait) {
        this.wait = wait;
    }

    private WebDriverWait wait;

    public DynamicPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ckickRemove() {
        driver.findElement(Locators.BUTTON_REMOVE).click();

    }

    public void clickADD() {
        driver.findElement(Locators.BUTTON_ADD).click();

    }

    public void clickENABLE() {
        driver.findElement(Locators.BUTTON_ENABLE).click();

    }

    public void clickDISABLE() {
        driver.findElement(Locators.BUTTON_DISABLE).click();
    }

    public String itsGone() {
        return driver.findElement(Locators.TEXT_ITSGONE).getText();
    }

    public String itsBack() {
        return driver.findElement(Locators.IT_S_BACK).getText();
    }

    public String itsENABLED() {
        return driver.findElement(Locators.IT_S_ENABLED).getText();
    }

    public String itsDisabled(By locator, String property) {
        return driver.findElement(locator).getDomProperty(property);
    }

    public boolean isCheckBox(By locator) {
        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException exception){
            return false;
        }
    }
}
