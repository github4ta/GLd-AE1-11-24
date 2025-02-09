package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adv {
    private static final By ADV_LOCATOR = By.xpath(
            "//div[@class='title-style title-style_primary-alter" +
                    " title-style_giant-other b2breg-advertising__title']");
    private WebDriver driver;

    public void Аdv() {
        this.driver = Singleton.getDriver();
    }

    public String getAdvText() {
        return driver.findElement(ADV_LOCATOR).getText();
    }
}
