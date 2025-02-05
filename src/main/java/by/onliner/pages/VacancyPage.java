package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.WebDriver;

public class VacancyPage {

     private WebDriver driver;

    public VacancyPage() {
        this.driver = Singleton.getDriver();
    }
}
