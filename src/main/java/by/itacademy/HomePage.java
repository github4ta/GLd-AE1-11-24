package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        String xPath = "//div[@class=\"auth-bar__item auth-bar__item--text\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        String xPath = "//span[@class=\"b-main-navigation__text\"][text()=\"Форум\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        String xPath = "//div[@class=\"footer-style__copy\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;

    }

    public void clickFooterLinkAboutCompany() {
        String xPath = "//a[@href=\"https://blog.onliner.by/about\"]";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public void click(String xPath) {
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}

