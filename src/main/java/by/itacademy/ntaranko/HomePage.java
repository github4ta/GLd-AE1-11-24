package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(HomePageLocators.BUTTON_LOGIN));
    }

    public void clickMenuLinkForum() {
        driver.findElement(By.xpath(HomePageLocators.MENU_LINK_FORUM));
    }

    public String getFooterCopyrightText() {
        return driver.findElement(By.xpath(HomePageLocators.FOOTER_COPYRIGHT)).getText();
    }

    public void clickFooterLinkAboutCompany() {
        driver.findElement(By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY));
    }

}
