import by.itacademy.maliushytski.DynamicallyLoadedElementsPage;
import by.itacademy.maliushytski.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicallyLoadedElementsPageTest {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testHiddenTextWithExampleOne() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Loading");
        DynamicallyLoadedElementsPage dynamicallyLoadedElementsPage = new DynamicallyLoadedElementsPage(driver);
        dynamicallyLoadedElementsPage.selectExample("Example one")
                .clickStartButton();
        Assertions.assertTrue(dynamicallyLoadedElementsPage.isHelloWorldVisible());
    }

    @Test
    public void testAbsentTextWithExampleTwo() {
        HomePage homePage = new HomePage(driver);
        homePage.openTopic("Dynamic Loading");
        DynamicallyLoadedElementsPage dynamicallyLoadedElementsPage = new DynamicallyLoadedElementsPage(driver);
        dynamicallyLoadedElementsPage.selectExample("Example two")
                .clickStartButton();
        Assertions.assertTrue(dynamicallyLoadedElementsPage.isHelloWorldVisible());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
