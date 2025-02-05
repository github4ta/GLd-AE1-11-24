package by.itacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenuLinkCatalog() throws InterruptedException {
    }

    public void clickMenuLinkApple() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(CatalogPageLocators.MENU_LINK_APPLE).click();
    }

    public void clickMenuLinkSmartphone() {
        driver.findElement(CatalogPageLocators.MENU_LINK_SMARTPHONE).click();
    }

    public void getTitleAppleSmartphoneText() {
        driver.findElement(CatalogPageLocators.TITLE_APPLE_SMARTPHONE).getText();
    }

    public void clickMenuLinkCatalogAndMenuLinkAppleAndMenuLinkSmartphoneAndGetTitleAppleSmartphoneText() throws InterruptedException {
        Thread.sleep(5000);
        clickMenuLinkCatalog();
        clickMenuLinkApple();
        clickMenuLinkSmartphone();
        getTitleAppleSmartphoneText();
    }
}
