package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumPage {
    private ChromeDriver driver;

    public ForumPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getTitleForumText() {
        return driver.findElement(By.xpath(ForumPageLocators.TITLE_FORUM)).getText();
    }

}
