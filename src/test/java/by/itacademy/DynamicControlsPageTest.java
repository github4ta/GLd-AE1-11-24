package by.itacademy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsPageTest {
    private WebDriver driver;
    private DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test()
    public void testCheckboxRemoval() {
        dynamicControlsPage.toggleCheckbox();
        Assertions.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "message");
        Assertions.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!", "Сообщение не совпадает!");
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
