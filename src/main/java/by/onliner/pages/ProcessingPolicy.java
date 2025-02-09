package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcessingPolicy {
    private WebDriver driver;
    private static final By HEADER_POLICY_LOCATOR = By.xpath(
            "//div[@class='news-header__title']//h1");

    public ProcessingPolicy() {
        this.driver = Singleton.getDriver();
    }

    public String getHeaderPolicyText() {
        return driver.findElement(HEADER_POLICY_LOCATOR).getText();
    }
}
