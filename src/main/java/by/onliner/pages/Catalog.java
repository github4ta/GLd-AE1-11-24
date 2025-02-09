package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Catalog {
    private final By CATALOG_TITLE = By.xpath("//h1[@class='catalog-navigation__title']");

    WebDriver driver;

    public Catalog() {
        this.driver = Singleton.getDriver();
    }

    public String getCatalogTitleText() {
        return driver.findElement(CATALOG_TITLE).getText();
    }
}
