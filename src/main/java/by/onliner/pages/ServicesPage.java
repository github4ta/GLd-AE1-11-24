package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage {
    private WebDriver driver;
    private final By ORDERS_TITLE = By.xpath("//div[@class='service-header__title service-header__title_huge']");

    public ServicesPage() {
        this.driver = Singleton.getDriver();
    }

    public String getTitleOfServicesPage() {
        return driver.findElement(ORDERS_TITLE).getText();
    }
}
