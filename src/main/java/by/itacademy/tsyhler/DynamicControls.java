package by.itacademy.tsyhler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.itacademy.tsyhler.DynamicControlsLocators.*;

public class DynamicControls {
    private WebDriver driver;

    public DynamicControls(WebDriver driver) {
        this.driver = driver;
    }

    public String addCheckbox(){
        driver.findElement(ADD_CHECKBOX_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(REMOVE_CHECKBOX_BUTTON)));
        return driver.findElement(SUCCESS_ADDING_CHECKBOX_MESSAGE).getText();
    }
    public String removeCheckbox(){
        driver.findElement(REMOVE_CHECKBOX_BUTTON).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(ADD_CHECKBOX_BUTTON)));
        return driver.findElement( SUCCESS_REMOVING_CHECKBOX_MESSAGE).getText();
    }
    public String disableInput(){
        driver.findElement(INPUT_DISABLED_BUTTON).click();
        return driver.findElement(SUCCESS_DISABLE_INPUT).getText();
    }

    public String enableInput(){
        driver.findElement(INPUT_ENABLED_BUTTON).click();
        return driver.findElement(SUCCESS_ENABLE_INPUT).getText();
    }
}
