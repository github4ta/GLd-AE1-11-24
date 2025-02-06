package by.onliner.pages;

import by.onliner.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogAbout {
    private final By INFORMATION_ABOUT_COMPANY = By.xpath("//div[@class='news-text']/child::h1");

    private WebDriver driver;

    public BlogAbout() {
        this.driver = Singleton.getDriver();
    }

    public String getBlogAboutTitleText() {
        return driver.findElement(INFORMATION_ABOUT_COMPANY).getText();
    }
}
