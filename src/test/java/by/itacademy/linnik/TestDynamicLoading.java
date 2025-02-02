package by.itacademy.linnik;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestDynamicLoading {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    @DisplayName("Нажимаем кнопку Start и проверяем на наличие теста Hello World!")
    public void Test1() {
        DynamicLoading dynamicLoading = new DynamicLoading(driver);
        dynamicLoading.clickStart();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.HELLO_WORLD));
        String actual = text.getText();
        Assertions.assertEquals("Hello World!", actual);
    }
}
