package by.itacademy.maliushytski;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(footerAboutCompanyLink));
            wait.until(ExpectedConditions.elementToBeClickable(footerAboutCompanyLink));
            menuLinkElement.click();
        } catch (StaleElementReferenceException e) {
            driver.navigate().refresh();
            By locator = By.xpath(HomePageLocators.FOOTER_LINK_ABOUT_COMPANY);
            WebElement element = driver.findElement(locator);
            element.click();
        }
        return this;
    }

    public HomePage clickAcceptCookies() {
        By acceptCookies = By.xpath(HomePageLocators.ACCEPT_COOKIES);
        WebElement acceptCookiesElement = driver.findElement(acceptCookies);
        acceptCookiesElement.click();
        return this;
    }

    public HomePage clickBasketButton() {
        By basketButton = By.xpath(HomePageLocators.BASKET_BUTTON);
        WebElement basketButtonElement = driver.findElement(basketButton);
        basketButtonElement.click();
        return this;
    }

    public String getFullPublicAgreementsText() {
        By publicAgreement = By.linkText(HomePageLocators.FULL_PUBLIC_AGREEMENTS);
        WebElement publicAgreementElement = driver.findElement(publicAgreement);
        return publicAgreementElement.getText();
    }

    public String getPartPublicAgreementsText() {
        By publicAgreement = By.partialLinkText(HomePageLocators.PART_PUBLIC_AGREEMENTS);
        WebElement publicAgreementElement = driver.findElement(publicAgreement);
        return publicAgreementElement.getText();
    }

    public List<String> getTopMenuTopics() {
        By topMenuTopics = By.cssSelector(HomePageLocators.TOP_MENU_OPTIONS);
        List<WebElement> topMenuTopicsElements = driver.findElements(topMenuTopics);
        return topMenuTopicsElements.stream().map(WebElement::getText).skip(1).collect(Collectors.toList());
    }
}
