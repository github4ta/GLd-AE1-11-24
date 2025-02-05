package by.itacademy;

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
        By clickButtonLogin = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement webElement = driver.findElement(clickButtonLogin);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        By clickMenuLinkForum = By.xpath(HomePageLocators.MENU_LINK_FORUM);
        WebElement webElement = driver.findElement(clickMenuLinkForum);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        By footerCopyrightText = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement webElement = driver.findElement(footerCopyrightText);
        String actual = webElement.getText();
        return actual;

    }

    public void clickFooterLinkAboutCompany() {
        By footerLinkAboutCompany = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
        WebElement webElement = driver.findElement(footerLinkAboutCompany);
        webElement.click();
    }

    public void click(String xPath) {
        By byXpath = By.xpath(xPath);
        WebElement webElement = driver.findElement(byXpath);
        webElement.click();
    }
}

