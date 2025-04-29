import by.itacademy.maliushytski.DynamicControlsPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsPageTest {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckboxPresence() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Controls");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        Assertions.assertTrue(dynamicControlsPage.isCheckboxPresent());
    }

    @Test
    public void testCheckboxNotPresent() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Controls");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemoveButton();
        Assertions.assertFalse(dynamicControlsPage.isCheckboxPresent());
    }

    @Test
    public void testFieldIsDisabled() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Controls");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        Assertions.assertFalse(dynamicControlsPage.isTextFieldEnabled());
    }

    @Test
    public void testFieldIsEnabled() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Controls");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickEnableButton();
        Assertions.assertTrue(dynamicControlsPage.isTextFieldEnabled());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
