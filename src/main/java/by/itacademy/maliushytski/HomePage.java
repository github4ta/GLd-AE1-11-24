package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickButtonLogin() {
        By loginButton = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
        return this;
    }

    public HomePage clickMenuLinkForum() {
        By menuLink = By.xpath(HomePageLocators.MENU_LINK_FORUM);
        WebElement menuLinkElement = driver.findElement(menuLink);
        menuLinkElement.click();
        return this;
    }

    public String getFooterCopyrightText() {
        By footerCopyright = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement footerCopyrightElement = driver.findElement(footerCopyright);
        return footerCopyrightElement.getText();
    }

    public HomePage clickFooterLinkAboutCompany() {
        By footerAboutCompanyLink = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
        WebElement menuLinkElement = driver.findElement(footerAboutCompanyLink);
        menuLinkElement.click();
        return this;
    }

    public static By returnByLocator(String locator) {
        return By.xpath(locator);
    }

    public HomePage clickAcceptCookies() {
        By acceptCookies = By.xpath(HomePageLocators.ACCEPT_COOKIES);
        WebElement acceptCookiesElement = driver.findElement(acceptCookies);
        acceptCookiesElement.click();
        return this;
    }
}
