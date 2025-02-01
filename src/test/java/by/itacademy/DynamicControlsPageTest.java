package by.itacademy;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsTest {
    private WebDriver driver;
    private DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public static void setUpInternet() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test(priority = 1)
    public void testCheckboxRemoval() {

        dynamicControlsPage.toggleCheckbox();


        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "Чекбокс не исчез!");


        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!", "Сообщение не совпадает!");
    }


    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
