package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoadingTest {
    public WebDriver driver;
    public String actual;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testRemoveCheckbox() {
        HerokuappDynamicControlls controlls=new HerokuappDynamicControlls(driver);
        actual = controlls.removeACheckbox();
        Assertions.assertEquals("It's gone!",actual);
    }

    @Test
    public void testRemoveTextbox(){
        HerokuappDynamicControlls controlls=new HerokuappDynamicControlls(driver);
        actual = controlls.enableTextBox();
        Assertions.assertEquals("It's enabled!",actual);
    }
}
