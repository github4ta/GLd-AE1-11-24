package by.itacademy.linnik;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDynamicLoading {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Waits.waitFor(4);
    }

    @AfterEach
    public void afterEach() {
        Waits.waitFor(4);
        driver.quit();
    }

    @Test
    @DisplayName("Нажимаем кнопку Start и проверяем на наличие теста Hello World!")
    public void Test1() {
        DynamicLoading dynamicLoading = new DynamicLoading(driver);
        dynamicLoading.clickStart();
        Waits.waitFor(4);
        String actual = "Hello World!";
        Waits.waitFor(4);
        Assertions.assertEquals(actual, dynamicLoading.helloWorld());
    }
}
