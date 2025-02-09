package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvPage {
    private static final By ADV_LOCATOR = By.xpath(
            "//div[text()='Реклама на сайте Onlíner']");
    private WebDriver driver;

    public AdvPage() {
        this.driver = Singleton.getDriver();
    }

    public String getAdvText() {
        return driver.findElement(ADV_LOCATOR).getText();
    }
}
