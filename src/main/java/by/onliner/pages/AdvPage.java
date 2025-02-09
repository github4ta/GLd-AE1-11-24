package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvPage {
    private static final By ADV_LOCATOR = By.xpath(
            "/html/body/div[1]/div[2]/div/div/div/div[1]/div[1]");
    private WebDriver driver;

    public AdvPage() {
        this.driver = Singleton.getDriver();
    }

    public String getAdvText() {
        return driver.findElement(ADV_LOCATOR).getText();
    }
}
