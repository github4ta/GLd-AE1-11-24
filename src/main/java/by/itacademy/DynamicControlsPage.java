package by.itacademy;

import org.openqa.selenium.WebDriver;

public class DynamicControlsPage {
    private WebDriver driver;

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemove() {
        driver.findElement(DynamicControlsLocators.BUTTON_REMOVE).click();
           }

    public void clickAdd() {
         driver.findElement(DynamicControlsLocators.BUTTON_ADD).click();

    }

    public void clickEnable() {
        driver.findElement(DynamicControlsLocators.BUTTON_ENABLE).click();

    }

    public void clickDisable() {
        driver.findElement(DynamicControlsLocators.BUTTON_DISABLE).click();

    }

    public void clickStart() {
        driver.findElement(DynamicControlsLocators.BUTTON_START).click();

    }

    public String getMessage() {
        return driver.findElement(DynamicControlsLocators.IT_S_GONE).getText();
    }
    public String getItsBack(){
        return driver.findElement(DynamicControlsLocators.IT_S_BACK).getText();

    }
    public String getItsEnable(){
        return driver.findElement(DynamicControlsLocators.IT_S_ENABLED).getText();
    }
    public String getItsDisable(){
        return driver.findElement(DynamicControlsLocators.IT_S_DISABLED).getText();
    }
}
