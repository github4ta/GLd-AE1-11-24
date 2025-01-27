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
        String xPath = HomePageLocators.BUTTON_LOGIN;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        String xPath = HomePageLocators.MENU_LINK_FORUM;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        String xPath = HomePageLocators.FOOTER_COPYRIGHT;
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        String actual = webElement.getText();
        return actual;

    }

    public void clickFooterLinkAboutCompany() {
        String xPath = HomePageLocators.FOOTER_LINK_ABOUT_COMPANY;
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

