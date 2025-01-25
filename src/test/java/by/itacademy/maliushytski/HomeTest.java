import by.itacademy.maliushytski.HomePageLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
    }

    @Test
    public void testFooterCopyrightText() {
        String expectedFooterCopyrightText = "© 2001—2025 Onlíner";
        By footerCopyrightTextLocator = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement element = driver.findElement(footerCopyrightTextLocator);
        Assertions.assertEquals(expectedFooterCopyrightText, element.getText());
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
