package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage {
    private final static By DYNAMIC_CONTROLS = By.xpath("//h4[.='Dynamic Controls']");
    private final static By CHECKBOX = By.xpath("//input[@type='checkbox']");
    private final static By REMOVE_BUTTON = By.xpath("//button[text()='Remove']");
    private final static By ADD_BUTTON = By.xpath("//button[text()='Add']");
    private final static By ENABLE_BUTTON = By.xpath("//button[text()='Enable']");
    private final static By DISABLE_BUTTON = By.xpath("//button[text()='Disable']");
    private final static By TEXT_FIELD = By.xpath("//input[@type='text']");
    private final static By IT_IS_GONE_LABEL = By.xpath("//p[.=\"It's gone!\"]");
    private final static By IT_IS_ENABLED_LABEL = By.xpath("//p[text()=\"It's enabled!\"]");

    private WebDriver driver;
    private Wait<WebDriver> wait;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        driver.findElement(DYNAMIC_CONTROLS);
    }

    public DynamicControlsPage clickRemoveButton() {
        WebElement removeButtonElement = driver.findElement(REMOVE_BUTTON);
        removeButtonElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(IT_IS_GONE_LABEL));
        return this;
    }

    public DynamicControlsPage clickAddButton() {
        WebElement addButtonElement = driver.findElement(ADD_BUTTON);
        addButtonElement.click();
        return this;
    }

    public boolean isCheckboxPresent() {
        try {
            WebElement element = driver.findElement(CHECKBOX);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public DynamicControlsPage clickEnableButton() {
        WebElement enableButtonElement = driver.findElement(ENABLE_BUTTON);
        enableButtonElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(IT_IS_ENABLED_LABEL));
        return this;
    }

    public DynamicControlsPage clickDisableButton() {
        WebElement disableButtonElement = driver.findElement(DISABLE_BUTTON);
        disableButtonElement.click();
        return this;
    }

    public boolean isTextFieldEnabled() {
        WebElement textFieldElement = driver.findElement(TEXT_FIELD);
        return textFieldElement.isEnabled();
    }
}
