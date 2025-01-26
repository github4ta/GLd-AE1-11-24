package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePageLocators {
    WebDriver driver;
    public static final String BUTTON_LOGIN = "//div[@class='auth-bar__item auth-bar__item--text']";
    public static final String MENU_LINK_FORUM = "//a[@href='https://forum.onliner.by/']";
    public static final String FOOTER_COPYRIGHT = "//div[@class='footer-style__copy']";
    public static final String FOOTER_LINK_ABOUT_COMPANY = "//a[@href='https://blog.onliner.by/about']";

    public HomePageLocators(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }

    public void clickMenuLinkForum() {
        driver.findElement(By.xpath(MENU_LINK_FORUM)).click();
    }

    public String getFooterCopyrightText() {
        return driver.findElement(By.xpath(FOOTER_COPYRIGHT)).getText();
    }

    public void clickFooterLinkAboutCompany() {
        driver.findElement(By.xpath(FOOTER_LINK_ABOUT_COMPANY)).click();
    }
}
