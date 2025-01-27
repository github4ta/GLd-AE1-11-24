package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ForumPage {
    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        String xPath = ForumPageLocators.TITLE_FORUM;
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        String actual = webElement.getText();
        return actual;
    }
}
