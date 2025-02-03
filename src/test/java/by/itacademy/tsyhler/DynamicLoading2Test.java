package by.itacademy.tsyhler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicLoading2Test {
    private WebDriver driver;
    @BeforeEach
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testHelloWorldIsAppearAfterStart(){
        DynamicLoading dynamicLoading = new DynamicLoading(driver);
        Assertions.assertEquals("Hello World!",dynamicLoading.helloWorldIsAppearAfterStart());
    }
    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
