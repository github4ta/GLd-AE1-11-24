package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    @DisplayName("Click start get text Hello World")
    public void testStart() {
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickStart();
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(DynamicLoadingLocators.HELLO_WORLD1));
        String actual = text.getText();
        Assertions.assertEquals("Hello World!", actual);
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
