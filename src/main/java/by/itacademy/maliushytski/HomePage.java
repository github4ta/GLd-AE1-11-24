package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final static String HOME_PAGE = "//h1[.='Welcome to the-internet']";
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(By.xpath(HOME_PAGE));
    }

    public HomePage openTopic(String topicName) {
        By locator = By.xpath("//a[text() = '" + topicName + "']");
        WebElement locatorElement = driver.findElement(locator);
        locatorElement.click();
        return this;
    }
}
