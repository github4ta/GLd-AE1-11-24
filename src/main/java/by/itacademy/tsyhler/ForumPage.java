package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.itacademy.tsyhler.ForumPageLocators.TITLE_FORUM;

public class ForumPage {

    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        return driver.findElement(By.xpath(TITLE_FORUM)).getText();
    }
}
