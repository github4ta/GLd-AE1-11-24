package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    public ChromeDriver driver;
    public String actual;
    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://forum.onliner.by/");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testGetForumTitle(){
        ForumPage fp=new ForumPage(driver);
        actual=fp.getTitleForumText();
        Assertions.assertEquals("Форум",actual);
    }
}
