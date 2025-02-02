package by.itacademy.ntaranko;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppPageTest {
    private WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    }

    @Test
    @DisplayName("A checkbox can be removed")
    public void test1() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickRemoveAddButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE_It_S_GONE_BACK);

        Assertions.assertFalse(hp.isElementPresent(HerokuAppLocators.CHECKBOX_A));
    }

    @Test
    @DisplayName("A checkbox can be added")
    public void test2() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickRemoveAddButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE_It_S_GONE_BACK);

        hp.clickRemoveAddButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE_It_S_GONE_BACK);

        Assertions.assertTrue(hp.isElementPresent(HerokuAppLocators.CHECKBOX_A));
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
