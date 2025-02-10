package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
    private final By HEADER_TEXT = By.xpath("//div[@Class='news-header__title']/child::h1");

    private WebDriver driver;

    public ContactsPage() {
        this.driver = Singleton.getDriver();
    }

    public String getHeaderText(){
        return driver.findElement(HEADER_TEXT).getText();
    }
}
