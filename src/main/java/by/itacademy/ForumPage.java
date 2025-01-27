package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumPage {
    private ChromeDriver driver;

    public ForumPage(ChromeDriver driver) {
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
