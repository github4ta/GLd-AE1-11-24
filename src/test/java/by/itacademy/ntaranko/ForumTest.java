package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    private WebDriver driver;

    @BeforeEach
    public void start(){
        driver = new ChromeDriver( );
        driver.get("https://www.onliner.by/");
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("forum contains Форум in header")
    public void test1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuLinkForum();

        ForumPage forumPage = new ForumPage(driver);
        String result = forumPage.getTitleForumText();

        Assertions.assertEquals("Форум", result);
    }

    @AfterEach
    public void end(){
        driver.quit();
    }
}
