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
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        Assertions.assertFalse(hp.isElementPresent(HerokuAppLocators.CHECKBOX_A));
    }

    @Test
    @DisplayName("A checkbox can be added")
    public void test2() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickRemoveAddButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        hp.clickRemoveAddButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        Assertions.assertTrue(hp.isElementPresent(HerokuAppLocators.CHECKBOX_A));
    }

    @Test
    @DisplayName("Input field can be enabled")
    public void test3() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickEnableDisableButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        Assertions.assertEquals("false", hp.getPropertyOfElement(HerokuAppLocators.FIELD_INPUT_TEXT, "disabled"));
    }

    @Test
    @DisplayName("Input field can be disabled")
    public void test4() {
        HerokuAppPage hp = new HerokuAppPage(driver);
        hp.clickEnableDisableButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        hp.clickEnableDisableButton();
        hp.waitForVisibilityOfElement(HerokuAppLocators.MESSAGE);

        Assertions.assertEquals("true", hp.getPropertyOfElement(HerokuAppLocators.FIELD_INPUT_TEXT, "disabled"));
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
