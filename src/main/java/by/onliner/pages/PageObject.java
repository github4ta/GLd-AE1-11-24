package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObject {
    private final WebDriver driver;
    private final By SUPPORT_REQUEST_PAGE = By.xpath( "//h1[text()='Запрос в службу поддержки']");

    public PageObject() {
        this.driver = Singleton.getDriver();
    }

    public String getSupportRequestPage() {
        return driver.findElement(SUPPORT_REQUEST_PAGE).getText();
    }
}