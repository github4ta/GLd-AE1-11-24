package by.itacademy.belaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        By byXPath = By.xpath(ForumPageLocators.TITLE_FORUM);
        WebElement webElement = driver.findElement(byXPath);
        return webElement.getText();
    }
}
