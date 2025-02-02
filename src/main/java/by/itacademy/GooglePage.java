package by.itacademy;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void textWrite() {
        WebElement webElement = driver.findElement(GooglePageLocators.GOOGLE_SEARCH);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).click().sendKeys("Вена").sendKeys(Keys.ENTER).perform();
    }
}
