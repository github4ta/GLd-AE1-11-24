package by.itacademy.tsyhler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    private WebDriver driver;
    private String expectedForumTitle = "Форум";

    @BeforeEach
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void forumTitleIsExist() {
        ForumPage forumPage = new ForumPage(driver);
        Assertions.assertEquals(expectedForumTitle, forumPage.getTitleForumText());
    }

    @AfterEach
    public void quitBrowser() {
        driver.quit();
    }
}
