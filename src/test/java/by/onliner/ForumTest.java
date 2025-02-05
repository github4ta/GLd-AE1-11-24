package by.onliner;

import by.onliner.pages.ForumPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ForumTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

    }

    @Test
    public void test() {
        ForumPage forumPage = new ForumPage(driver);
        forumPage.clickForum();
        String actual = forumPage.getTextForum();
        Assertions.assertEquals("Форум", actual);

    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
