package by.itacademy.linnik;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestDynamicPage {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        ChromeOptions chromeOptions = new ChromeOptions();
        Duration duration = Duration.ofSeconds(5);
        chromeOptions.setImplicitWaitTimeout(duration);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    @DisplayName("Нажимаем кнопку Remove и проверяем на наличие текста It's gone!")
    public void Test1() {
        DynamicPage dynamicPage = new DynamicPage(driver);
        dynamicPage.ckickRemove();
        String actual = "It's gone!";
        Assertions.assertEquals(actual,dynamicPage.itsGone());
    }

    @Test
    @DisplayName("Нажимаем кнопку Add и проверяем на наличие текста It's back!")
    public void Test2() {
        DynamicPage dynamicPage = new DynamicPage(driver);
        dynamicPage.ckickRemove();
        dynamicPage.clickADD();
        String actual = "It's gone!";
        Assertions.assertEquals(actual,dynamicPage.itsBack());
    }

    @Test
    @DisplayName("Нажимаем кнопку Enable и проверяем на наличие текста It's enabled!")
    public void Test3() {
        DynamicPage dynamicPage = new DynamicPage(driver);
        dynamicPage.clickENABLE();
        String actual = "It's enabled!";
        Assertions.assertEquals(actual, dynamicPage.itsENABLED());
    }

    @Test
    @DisplayName("Нажимаем кнопку Disable и проверяем на появление текста It's disabled!")
    public void Test4() {
        DynamicPage dynamicPage = new DynamicPage(driver);
        dynamicPage.clickENABLE();
        dynamicPage.clickDISABLE();
        String actual = "It's enabled!";
        Assertions.assertEquals(actual,dynamicPage.itsDisabled());
    }
}
