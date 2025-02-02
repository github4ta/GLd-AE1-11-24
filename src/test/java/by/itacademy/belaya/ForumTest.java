package by.itacademy.belaya;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {

    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
    }

    @Test
    @DisplayName("Заголовок страницы содержит Форум")
    public void testHeadingForum(){
        HomePage homePage = new HomePage(driver);
        ForumPage forumPage = new ForumPage(driver);
        Assertions.assertEquals("Форум",forumPage.getTitleForumText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
