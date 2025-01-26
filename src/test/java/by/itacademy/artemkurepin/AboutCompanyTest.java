package by.itacademy.artemkurepin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutCompanyTest {
    public ChromeDriver driver;
    public String actual;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://blog.onliner.by/about");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void testAboutCompanyTitle(){
        AboutCompanyPage acp=new AboutCompanyPage(driver);
        actual=acp.getTitleAboutCompanyText();
        Assertions.assertEquals("Информация о компании",actual);
    }
}
