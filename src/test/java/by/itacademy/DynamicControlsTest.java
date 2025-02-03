package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DynamicControlsTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        ChromeOptions chromeOptions = new ChromeOptions();
        Duration duration = Duration.ofSeconds(5);
        chromeOptions.setImplicitWaitTimeout(duration)
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    @DisplayName("Click remove")
    public void testClick() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        Assertions.assertEquals("It's gone!", dynamicControlsPage.getMessage());
    }

    @Test
    @DisplayName("Click add get text It's back!")
    public void testClick1() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        dynamicControlsPage.clickAdd();
        Assertions.assertEquals("It's back!", dynamicControlsPage.getItsBack());

    }

    @Test
    @DisplayName("Click button enable get text It's enable ")
    public void testClick2() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickEnable();
        Assertions.assertEquals("It's enabled!", dynamicControlsPage.getItsEnable());

    }

    @Test
    @DisplayName("Click button disable and get text It's disabled")
    public void testClick3() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickEnable();
        dynamicControlsPage.clickDisable();
        Assertions.assertEquals("It's disabled!", dynamicControlsPage.getItsDisable());

    }

    @Test
    public void testText() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        Waits.waitFor(4);
        Assertions.assertTrue(dynamicControlsPage.isCheckbox(DynamicControlsLocators.CHECKBOX_A));
    }

    @Test
    @DisplayName("")
    public void testText1() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        dynamicControlsPage.clickAdd();
        Waits.waitFor(4);
        Assertions.assertFalse(dynamicControlsPage.isCheckbox(DynamicControlsLocators.CHECKBOX_A));
    }


    @AfterEach
    public void afterEach() {

        driver.quit();
    }
}
