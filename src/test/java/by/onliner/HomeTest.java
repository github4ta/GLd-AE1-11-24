package by.onliner;

import by.onliner.page.object.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeTest {

    @Test
    public void testPageOpened(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://money.onliner.by/");
        HomePage homePage = new HomePage(driver);
        String actual = homePage.getTextCopyright();
        Assertions.assertEquals("© 2001—2025 Onlíner", actual);
    }
}
