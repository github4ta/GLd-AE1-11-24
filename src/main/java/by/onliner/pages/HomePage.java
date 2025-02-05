package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }
}
