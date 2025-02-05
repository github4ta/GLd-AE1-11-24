package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HousesAndApartmentsPage {
    public static final By SPAN_SELL = By.xpath
            ("//span[contains(@class, 'project-navigation__sign') and contains(text(), 'Продажа')]");
    public static final By SPAN_RENT = By.xpath
            ("//span[contains(@class, 'project-navigation__sign') and contains(text(), 'Аренда')]");
    private static final String URL = "https://r.onliner.by/pk/";

    private WebDriver driver;

    public HousesAndApartmentsPage() {
        this.driver = Singleton.getDriver();
    }

    public String getSellText() {
        return driver.findElement(SPAN_SELL).getText();
    }

    public String getRentText() {
        return driver.findElement(SPAN_RENT).getText();
    }

    public HousesAndApartmentsPage open() {
        driver.get(URL);
        return this;
    }
}
