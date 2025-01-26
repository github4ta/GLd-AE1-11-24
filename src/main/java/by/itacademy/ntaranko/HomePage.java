package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(HomePageLocators.BUTTON_LOGIN));
    }

    public void clickMenuLinkForum() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(HomePageLocators.MENU_LINK_FORUM));
    }

    public void getFooterCopyrightText() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(HomePageLocators.FOOTER_COPYRIGHT));
    }

    public void clickFooterLinkAboutCompany() {
        driver = new ChromeDriver();
        driver.findElement(By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY));
    }

}
