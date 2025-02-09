package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private final By SITE_RULES_LINK = By.xpath("//a[@href='https://blog.onliner.by/siterules']");

    public HomePage(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }

    public void clickSiteRulesLink() {
        driver.findElement(SITE_RULES_LINK).click();
    }
}
