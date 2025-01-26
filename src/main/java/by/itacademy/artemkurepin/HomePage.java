package by.itacademy.artemkurepin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        WebElement webElement = driver.findElement(By.xpath(HomePageLocators.BUTTON_LOGIN));
        webElement.click();
    }

    public void clickMenuLinkForum() {
        WebElement webElement = driver.findElement(By.xpath(HomePageLocators.MENU_LINK_FORUM));
        webElement.click();
    }

    public String getFooterCopyrightText() {
        WebElement webElement = driver.findElement(By.xpath(HomePageLocators.FOOTER_COPYRIGHT));
        return webElement.getText();
    }

    public void clickFooterLinkAboutCompany() {
        WebElement webElement = driver.findElement(By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY));
        webElement.click();
    }

    public void driverQuit() {
        this.driver.quit();
    }
}
