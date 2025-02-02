package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuAppPageTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    @DisplayName("A checkbox can be removed")
    public void test1() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickRemoveButton();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(HerokuAppLocators.MESSAGE_It_S_GONE));

        Assertions.assertFalse(hp.isElementPresent(HerokuAppLocators.CHECKBOX_A));
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
