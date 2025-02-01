package by.itacademy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControlsTest {
    private WebDriver driver;
    private DynamicControlsPage dynamicControlsPage;

    @BeforeClass
    public void setUp() {
        // Установите путь к вашему драйверу (например, ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Инициализация драйвера
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test()
    public void testCheckboxRemoval() {
        // Убираем чекбокс
        dynamicControlsPage.toggleCheckbox();


        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(), "Чекбокс не исчез!");


        Assert.assertEquals(dynamicControlsPage.getMessageText(), "It's gone!", "Сообщение не совпадает!");
    }



    @AfterClass
    public void tearDown() {
        // Закрываем браузер
        if (driver != null) {
            driver.quit();
        }
    }
}
