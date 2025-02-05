package by.itacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalculatorPage {
    private WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGenderM() {
        WebElement webElement = driver.findElement(CalculatorPageLocators.GENDER);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement, 50, 0).click().perform();
    }

    public void clickGenderF() {
        WebElement webElement = driver.findElement(CalculatorPageLocators.GENDER);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement, 90, 0).click().perform();
    }

    public void clickCalculate() {
        WebElement webElement = driver.findElement(CalculatorPageLocators.GENDER);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement, 90, 30).click().perform();
    }
}
