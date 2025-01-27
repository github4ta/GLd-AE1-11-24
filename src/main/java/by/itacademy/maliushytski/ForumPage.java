package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        By titleForum = By.xpath(ForumPageLocators.TITLE_FORUM);
        WebElement titleForumElement = driver.findElement(titleForum);
        return titleForumElement.getText();
    }
}
