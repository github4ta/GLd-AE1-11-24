package by.itacademy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest1 {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    @DisplayName("Wien")
    public void enterTest(){
        GooglePage googlePage = new GooglePage(driver);
        googlePage.textWrite();
        Waits.waitFor(5);
    }

    @AfterEach
    public void afterEach(){
        driver.quit();
    }
}
