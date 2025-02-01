package by.itacademy.belaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        By byXPath = By.xpath(HomePageLocators.BUTTON_LOGIN);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public void clickMenuLinkForum() {
        By byXPath = By.xpath(HomePageLocators.MENU_LINK_FORUM);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }

    public String getFooterCopyrightText() {
        By byXPath = By.xpath(HomePageLocators.FOOTER_COPYRIGHT);
        WebElement webElement = driver.findElement(byXPath);

        return webElement.getText();
    }

    public void clickFooterLinkAboutCompany() {
        By byXPath = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
        WebElement webElement = driver.findElement(byXPath);
        webElement.click();
    }
}
