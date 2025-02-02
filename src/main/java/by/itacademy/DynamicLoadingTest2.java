package by.itacademy;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicLoadingTest2 {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
    }

    @Test
    @DisplayName("Click start get text Hello World2")
    public void testStart(){
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);
        dynamicControlsPage.clickStart();
        Waits.waitFor(4);
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);
        Waits.waitFor(4);
        Assertions.assertEquals("Hello World!", dynamicLoadingPage.getTextHelloWorld2());
    }


    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}

