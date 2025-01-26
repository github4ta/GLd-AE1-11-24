package by.itacademy.primako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        String xPath = "/html/body/div[1]/div/div/div/header/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        String xPath = "/html/body/div[1]/div/div/div/header/div[2]/div/nav/ul[1]/li[7]/a/span";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        String xPath = "/html/body/div[1]/footer/div/div/div/div[2]/div[2]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;
    }

    public void clickFooterLinkAboutCompany() {
        String xPath = "/html/body/div[1]/footer/div/div/div/div[1]/ul/li[1]/a";
        By byXPath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }
}
