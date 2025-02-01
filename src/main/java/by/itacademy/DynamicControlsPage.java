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
}


