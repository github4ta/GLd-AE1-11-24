package by.itacademy.tsyhler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.itacademy.tsyhler.DynamicLoadingLocators.HELLO_WORLD_PHRASE;
import static by.itacademy.tsyhler.DynamicLoadingLocators.START_BUTTON;

public class DynamicLoading {
    private WebDriver driver;

    public DynamicLoading(WebDriver driver) {
        this.driver = driver;
    }
    public String helloWorldIsAppearAfterStart(){
        driver.findElement(START_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(HELLO_WORLD_PHRASE)));
        return driver.findElement(HELLO_WORLD_PHRASE).getText();
    }
}
