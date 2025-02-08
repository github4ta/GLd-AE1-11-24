package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
    private final WebDriver driver;
    private final By SUPPORT_REQUEST_PAGE = By.xpath("//a[@href='https://support.onliner.by']");

    public PageObject() {
        this.driver = Singleton.getDriver();
    }

}