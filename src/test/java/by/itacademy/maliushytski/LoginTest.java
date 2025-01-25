import by.itacademy.maliushytski.HomePageLocators;
import by.itacademy.maliushytski.LoginPageLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testFooterCopyrightText() {
        String expectedEntryName = "Вход";
        By loginButtonLocator = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonElement));
        loginButtonElement.click();
        By entryLocator = By.xpath(LoginPageLocators.TITLE_LOGIN);
        WebElement entryElement = driver.findElement(entryLocator);
        Assertions.assertEquals(expectedEntryName, entryElement.getText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
