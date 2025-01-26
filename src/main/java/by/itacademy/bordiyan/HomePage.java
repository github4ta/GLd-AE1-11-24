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
        By xPath = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement webElement = driver.findElement(xPath);
        String actual = webElement.getText();
        return actual;
    }

    public void clickFooterLinkAboutCompany() {
        By xPath = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
        WebElement webElement = driver.findElement(xPath);
        webElement.click();
    }
}
