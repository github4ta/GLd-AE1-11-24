package by.itacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsPageTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    public void testCheckboxRemoval() {
        pageMethods.toggleCheckbox();


        Assert.assertTrue(pageMethods.isCheckboxDisplayed(), "Чекбокс не исчез!");

        // Проверяем сообщение
        Assert.assertEquals(pageMethods.getMessageText(), "It's gone!", "Сообщение не совпадает!");
    }


    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
