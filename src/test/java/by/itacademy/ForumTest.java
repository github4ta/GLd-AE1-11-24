package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    ChromeDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Проверка, что заголовк страницы есть Форум")
    public void getText(){
        ForumPage forumPage = new ForumPage(driver);
        Assertions.assertEquals("ФОРУМ",forumPage.getTitleForumText());
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}