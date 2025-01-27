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
        By titleForumPage = By.xpath(ForumPageLocators.TITLE_FORUM);
        WebElement webElement = driver.findElement(titleForumPage);
        String actual = webElement.getText();
        return actual;
    }
}
