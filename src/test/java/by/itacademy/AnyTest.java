package by.itacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyTest {
    @Test
    public void testH1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.onliner.by/");
        String actual = driver.findElement(AnyPage.xPath).getText();
        Assertions.assertEquals("Все новости",actual);
        driver.quit();
    }

    @Test
    public void testH12(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://catalog.onliner.by/notebook");
        String actual = driver.findElement(AnyPage.xPath1).getText();
        Assertions.assertEquals("Ноутбуки", actual);
        driver.quit();
    }
}
