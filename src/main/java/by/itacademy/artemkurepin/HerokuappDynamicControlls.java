package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuappDynamicControlls {
    private WebDriver driver;

    public HerokuappDynamicControlls(WebDriver driver) {
        this.driver = driver;
    }

    public String removeACheckbox() {
        driver.findElement(By.cssSelector(PageLocators.A_CHECKBOX)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id(PageLocators.ID_TEXT_REMOVED_CHECKBOX)));
        return getMessageAfterAction();
    }

    public String enableTextBox() {
        driver.findElement(By.xpath(PageLocators.SWITCH_ENABLED_BUTTON)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id(PageLocators.ID_TEXT_REMOVED_CHECKBOX)));
        return getMessageAfterAction();
    }

    public String getMessageAfterAction() {
        return driver.findElement(By.id(PageLocators.ID_TEXT_REMOVED_CHECKBOX)).getText();
    }


}
