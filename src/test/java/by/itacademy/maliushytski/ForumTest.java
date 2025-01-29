import by.itacademy.maliushytski.ForumPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testForumPageTitle() {
        String expectedForumPageTitle = "Форум";
        ForumPage forumPage = new ForumPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuLinkForum();
        Assertions.assertEquals(expectedForumPageTitle, forumPage.getTitleForumText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
