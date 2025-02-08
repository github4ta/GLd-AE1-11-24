package by.itacademy.tsyhler;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class DynamicControlsTest {
    private WebDriver driver;

    @BeforeEach
    public void startBrowser() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Тест на добавление и снятия чекбокса")
    public void testAddingCheckbox() {
        DynamicControls mainPage = new DynamicControls(driver);
        Assertions.assertEquals("It's gone!", mainPage.removeCheckbox());
        Assertions.assertEquals("It's back!", mainPage.addCheckbox());
    }

    @Test
    @DisplayName("Поле ввода становится enabled и disabled на странице")
    public void testDisableInput() {
        DynamicControls mainPage = new DynamicControls(driver);
        Assertions.assertEquals("It's enabled!", mainPage.enableInput());
        Assertions.assertEquals("It's disabled!", mainPage.disableInput());
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
