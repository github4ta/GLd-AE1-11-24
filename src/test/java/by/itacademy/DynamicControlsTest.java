package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    @DisplayName("Click remove")
    public void testClick() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        Waits.waitFor(4);
        Assertions.assertEquals("It's gone!",dynamicControlsPage.getMessage());
    }

    @Test
    @DisplayName("Click add get text It's back!")
    public void testClick1() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickRemove();
        Waits.waitFor(4);
        dynamicControlsPage.clickAdd();
        Waits.waitFor(4);
        Assertions.assertEquals("It's back!",dynamicControlsPage.getItsBack());

    }

    @Test
    @DisplayName("Click button enable get text It's enable ")
    public void testClick2() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickEnable();
        Waits.waitFor(4);
        Assertions.assertEquals("It's enabled!",dynamicControlsPage.getItsEnable());

    }

    @Test
    @DisplayName("Click button disable and get text It's disabled")
    public void testClick3() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickEnable();
        Waits.waitFor(4);
        dynamicControlsPage.clickDisable();
        Waits.waitFor(4);
        Assertions.assertEquals("It's disabled!",dynamicControlsPage.getItsDisable());

    }


    @AfterEach
    public void afterEach() {
        Waits.waitFor(4);
        driver.quit();
    }
}
