package by.itacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DynamicControlsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void toggleCheckbox() {
        WebElement toggleButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.TOGGLE_CHECK_BOX_BUTTON_REMOVE));
        toggleButton.click();
    }

    public boolean isCheckboxDisplayed() {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(Locators.CHECKBOX));
    }

    public String getMessageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.MESSAGE)).getText();
    }

    public void toggleInputField() {
        WebElement toggleButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.TOGGLE_INPUT_BUTTON));
        toggleButton.click();
    }

    public boolean isInputFieldEnabled() {
        return wait.until(ExpectedConditions.elementToBeClickable(Locators.INPUT_FIELD)).isEnabled();
    }
}


