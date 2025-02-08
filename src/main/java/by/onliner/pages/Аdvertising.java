package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Аdvertising {
    private WebDriver driver;

    private static final By DIV_ADV_LOCATOR = By.xpath(
            "//div[@class='title-style title-style_primary-alter" +
                    " title-style_giant-other b2breg-advertising__title']");
    private static final String URL = "https://b2breg.onliner.by/advertising";

    public Аdvertising(WebDriver driver) {
        this.driver = Singleton.getDriver();
    }


}
