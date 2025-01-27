package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.itacademy.tsyhler.ForumPageLocators.TITLE_FORUM;

public class ForumPage {

    private WebDriver driver;
    private HomePage homePage;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(this.driver);
    }

    public String getTitleForumText() {
        homePage.clickMenuLinkForum();
        return driver.findElement(By.xpath(TITLE_FORUM)).getText();
    }
}
