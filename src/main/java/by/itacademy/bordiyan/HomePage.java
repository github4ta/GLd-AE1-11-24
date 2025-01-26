package by.itacademy.bordiyan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    private final ChromeDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.onliner.by/");
    }


    public void clickButtonLogin() {
        String xPath = "//div[text()='Вход']";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        String xPath = "//div[text()='Вход']";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }




    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
