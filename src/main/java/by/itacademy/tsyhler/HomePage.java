package by.itacademy.tsyhler;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.itacademy.tsyhler.HomePageLocators.*;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
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
        WebElement webElement = driver.findElement(By.xpath(FOOTER_LINK_ABOUT_COMPANY));
        try {
            webElement.click();
        } catch (StaleElementReferenceException e) {
            // driver.navigate().refresh();
            webElement = driver.findElement(By.xpath(FOOTER_LINK_ABOUT_COMPANY));
            webElement.click();
        }

    }
}
