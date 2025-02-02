package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuappDynamicLoading {
    private WebDriver driver;

    public HerokuappDynamicLoading(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFromHiddenElement() {
        driver.findElement(By.xpath(PageLocators.BUTTON_START)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath(PageLocators.HELLO_WORLD_TEXT)));
        return driver.findElement(By.xpath(PageLocators.HELLO_WORLD_TEXT)).getText();
    }

    public String getTextFromLoadedElement() {
        driver.findElement(By.xpath(PageLocators.BUTTON_START)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(PageLocators.HELLO_WORLD_TEXT)));
        return driver.findElement(By.xpath(PageLocators.HELLO_WORLD_TEXT)).getText();
    }


}
