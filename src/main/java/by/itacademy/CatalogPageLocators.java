package by.itacademy;

import org.openqa.selenium.By;

public class CatalogPageLocators {
    public static final By MENU_LINK_APPLE = By.xpath("(//li[@class=\"catalog-navigation-classifier__item catalog-navigation-classifier__item_brand\"])[2]");
    public static final By MENU_LINK_SMARTPHONE = By.xpath("(//span[@class=\"catalog-navigation-list__dropdown-data\"])[1]");
    public static final By TITLE_APPLE_SMARTPHONE = By.xpath("//h1[@class=\"catalog-masthead__title\"]");
}
