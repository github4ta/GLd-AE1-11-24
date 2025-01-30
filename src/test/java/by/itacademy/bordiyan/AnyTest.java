package by.itacademy.bordiyan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyTest {
    @Test
    public void testH1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blog.onliner.by/manifest");
        String actual = driver.findElement(AnyPage.xPath).getText();
        Assertions.assertEquals("Манифест", actual);
        driver.quit();
    }
}

