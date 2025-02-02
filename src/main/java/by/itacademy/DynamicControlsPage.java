package by.itacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlsPage {
    private WebDriver driver;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckbox(){
        WebElement webElement = driver.findElement(DynamicControlsLocators.CHECKBOX_DELETE);
        webElement.click();
    }
}
