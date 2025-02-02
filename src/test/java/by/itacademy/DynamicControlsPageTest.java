package by.itacademy;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsPageTest {
    private WebDriver driver;
    private DynamicControlsPage dynamicControlsPage;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test
    public void testCheckboxRemoval() {
        dynamicControlsPage.toggleCheckbox();
        Assertions.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "message");
        Assertions.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!", "Сообщение не совпадает!");
    }

    @Test
    public void testInputFieldEnabled() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage.toggleInputField();
        Assertions.assertTrue(dynamicControlsPage.isInputFieldEnabled(), "Поле ввода не активно!");
        Assertions.assertEquals(dynamicControlsPage.getMessageText(), "It's enabled!", "Сообщение не совпадает!");
    }

    @Test
    public void testInputFieldDisabled() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        if (!dynamicControlsPage.isInputFieldEnabled()) {
            dynamicControlsPage.toggleInputField();
        }
        dynamicControlsPage.toggleInputField();
        Assertions.assertFalse(dynamicControlsPage.isInputFieldEnabled(), "Поле ввода не деактивировано!");
        Assertions.assertEquals(dynamicControlsPage.getMessageText(), "It's disabled!", "Сообщение не совпадает!");
    }


    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
