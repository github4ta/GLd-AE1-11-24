package by.itacademy.bordiyan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        By xPath = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement webElement = driver.findElement(xPath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        By xPath = By.xpath(HomePageLocators.MENU_LINK_FORUM);
        WebElement webElement = driver.findElement(xPath);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        String xPath = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement webElement = driver.findElement(xPath);
        String actual = webElement.getText();
        return actual;
    }

    public void clickFooterLinkAboutCompany() {
        String xPath = "//a[@href=\'https://blog.onliner.by/about\']";
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}
