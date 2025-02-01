package by.itacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage {
    private WebDriver driver;

    public void toggleCheckbox(){
    WebElement toggleButton = ExpectedConditions.elementToBeClickable(Locators.toggleCheckboxButton);
        toggleButton.click();
}

}
