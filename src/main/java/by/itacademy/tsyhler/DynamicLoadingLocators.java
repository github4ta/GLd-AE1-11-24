package by.itacademy.tsyhler;

import org.openqa.selenium.By;

public class DynamicLoadingLocators {
    final static By START_BUTTON = By.xpath("//div[@id='start']/button");
    final static By HELLO_WORLD_PHRASE = By.xpath("//div[@id='finish']/*");
}
