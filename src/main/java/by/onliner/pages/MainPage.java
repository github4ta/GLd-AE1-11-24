package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private final String URL = "https://www.onliner.by/";
    private final By SERVICE_SECTION_BUTTON = By.xpath("//a [@href='https://s.onliner.by/tasks' and @class='b-main-navigation__link']");

    public MainPage(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }

    public MainPage openDriver() {
        driver.get(URL);
        return this;
    }

    public ServicesPage clickServiceSectionButton() {
        driver.findElement(SERVICE_SECTION_BUTTON).click();
        return new ServicesPage(driver);
    }
}
