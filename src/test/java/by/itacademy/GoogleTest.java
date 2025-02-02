package by.itacademy;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class GoogleTest {
    WebDriver driver = new ChromeDriver();

        private static final String SEARCH_FIELD="//textarea[@class=\"gLFyf\"]";

    @Test
    public void testGoogleSaerch(){
        driver.get("https://www.google.com/");
        By search = By.xpath(SEARCH_FIELD);
        WebElement webElement = driver.findElement(search);
        new Actions(driver).moveToElement(webElement).click().sendKeys("Test").sendKeys(Keys.ENTER).perform();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
