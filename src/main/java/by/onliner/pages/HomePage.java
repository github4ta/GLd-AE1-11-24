package by.onliner.pages;

import org.openqa.selenium.By;

public class HomePage {
    private final By INPUT_SEARCH_LOCATOR = By.xpath("//input[@name='query']") ;
    private final By BUTTON_ENTER_LOCATOR = By.xpath("//div[@class='auth-bar__item auth-bar__item--text']");
    private final By COPYRIGHT_LOCATOR = By.xpath("//div[@class='footer-style__copy']");
}
