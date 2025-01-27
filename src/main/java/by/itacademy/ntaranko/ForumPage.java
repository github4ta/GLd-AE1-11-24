package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumPage {
    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        return driver.findElement(By.xpath(ForumPageLocators.TITLE_FORUM)).getText();
    }
}
