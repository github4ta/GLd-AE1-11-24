package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private final String URL = "https://www.onliner.by/";
    private final By SERVICE_SECTION_BUTTON = By.xpath("//a [@href='https://s.onliner.by/tasks' and @class='b-main-navigation__link']");

    public HomePage openPage() {
        driver.get(URL);
        return this;
    }

    public ServicesPage clickServiceSectionButton() {
        driver.findElement(SERVICE_SECTION_BUTTON).click();
        return new ServicesPage();
    }

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    private final By LINK_VACANCY = By.xpath("//a[@href='https://blog.onliner.by/vacancy']");
    private final By COPYRIGHT_TEXT_LOCATOR = By.xpath("//div[@class='footer-style__copy']");
    private final By ENTER_TEXT_LOCATOR = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");
    private final By SEARCH_TEXT_LOCATOR = By.xpath("//input[@name='query']");
    private final By NEWS_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Новости']");
    private final By AVTOBARAHOLKA_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Автобарахолка']");
    private final By HOUSES_AND_FLATS_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Дома и квартиры']");
    private final By SERVICES_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Услуги']");
    private final By BARAHOLKA_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Барахолка']");
    private final By FORUM_LINK_LOCATOR =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Форум']");
    private final By VACANCIES_LINK_LOCATOR =
            By.xpath("//a[@href='https://blog.onliner.by/vacancy']");
    private final By ADVERTISING_LINK_LOCATOR =
            By.xpath("//a[@href='https://b2breg.onliner.by/advertising']");
    private final By PLANS_LINK_LOCATOR =
            By.xpath("//a[@href='https://docs.google.com/spreadsheets/d/1SGFaTkV_Ru4vI29ml9yvR-dMz9rOl7DVVpKk64w5lqM/preview']");
    private By MANIFEST_BUTTON =
            By.xpath("//a[@href='https://blog.onliner.by/manifest']");
    private final By AUTO_FLEA_MARKET_TITLE =
            By.xpath("//span[@class='b-main-navigation__text' and text()='Автобарахолка']");

    public String getCopyrightText() {
        return driver.findElement(COPYRIGHT_TEXT_LOCATOR).getText();
    }

    public String getEnterText() {
        return driver.findElement(ENTER_TEXT_LOCATOR).getText();
    }

    public String getSearchText() {
        return driver.findElement(SEARCH_TEXT_LOCATOR).getText();
    }

    public void clickNewsLink() {
        driver.findElement(NEWS_LINK_LOCATOR).click();
    }

    public void clickAvtobaraholkaLink() {
        driver.findElement(AVTOBARAHOLKA_LINK_LOCATOR).click();
    }

    public void clickHousesAndFlatsLink() {
        driver.findElement(HOUSES_AND_FLATS_LINK_LOCATOR).click();
    }

    public void clickBaraholkaLink() {
        driver.findElement(BARAHOLKA_LINK_LOCATOR).click();
    }

    public void clickForumLink() {
        driver.findElement(FORUM_LINK_LOCATOR).click();
    }

    public void clickVacanciesLink() {
        driver.findElement(VACANCIES_LINK_LOCATOR).click();
    }

    public void clickAdvertisingLink() {
        driver.findElement(ADVERTISING_LINK_LOCATOR).click();
    }

    public void clickPlansLink() {
        driver.findElement(PLANS_LINK_LOCATOR).click();
    }

    public void clickManifestButton() {
        driver.findElement(MANIFEST_BUTTON).click();
    }

    public void clickLinkVacancy() {
        driver.findElement(LINK_VACANCY).click();
    }

    public void getTexstAutoFealMarket() {
        driver.findElement(AUTO_FLEA_MARKET_TITLE).getText();
    }
}
