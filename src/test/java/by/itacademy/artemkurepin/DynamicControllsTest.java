package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControllsTest {
    public WebDriver driver;
    public String actual;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testShowFromHiddenElement(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        HerokuappDynamicLoading dynamicLoading=new HerokuappDynamicLoading(driver);
        actual=dynamicLoading.getTextFromHiddenElement();
        Assertions.assertEquals("Hello World!",actual);
    }
    @Test
    public void testShowFromLoadedElement(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        HerokuappDynamicLoading dynamicLoading=new HerokuappDynamicLoading(driver);
        actual=dynamicLoading.getTextFromLoadedElement();
        Assertions.assertEquals("Hello World!",actual);
    }

}
