package by.itacademy.ntaranko;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickButtonLogin() {
        driver.findElement(By.xpath(HomePageLocators.BUTTON_LOGIN)).click();
    }

    public void clickMenuLinkForum() {
        driver.findElement(By.xpath(HomePageLocators.MENU_LINK_FORUM)).click();
    }

    public String getFooterCopyrightText() {
        return driver.findElement(By.xpath(HomePageLocators.FOOTER_COPYRIGHT)).getText();
    }

    public void clickFooterLinkAboutCompany() {
        By footerAboutCompanyLink = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
        WebElement aboutCompanyLink = driver.findElement(footerAboutCompanyLink);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(footerAboutCompanyLink));
            wait.until(ExpectedConditions.elementToBeClickable(footerAboutCompanyLink));
            aboutCompanyLink.click();
        } catch (StaleElementReferenceException e) {
            driver.navigate().refresh();
            driver.findElement(By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY)).click();
        }
    }

    public void clickCart() {
        driver.findElement(By.xpath(HomePageLocators.BUTTON_CART)).click();
    }

    public String getHeadphoneSectionByFullText() {
        return driver.findElement(By.linkText(HomePageLocators.LINK_TEXT_HEADPHONE)).getText();
    }

    public String getHeadphoneSectionByPartialText() {
        return driver.findElement(By.partialLinkText(HomePageLocators.LINK_PARTIAL_TEXT_HEADPHONE)).getText();
    }
}
