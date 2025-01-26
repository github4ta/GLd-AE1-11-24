package by.itacademy.bordiyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    private ChromeDriver driver;

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

}
