package by.itacademy.tsyhler;

import org.openqa.selenium.By;

public class DynamicControlsLocators {
    final static By INPUT_ENABLED_BUTTON = By.xpath("//button[text()='Enable']");
    final static By INPUT_DISABLED_BUTTON = By.xpath("//button[text()='Disable']");
    final static By ADD_CHECKBOX_BUTTON = By.xpath("//button[text()='Add']");
    final static By REMOVE_CHECKBOX_BUTTON = By.xpath("//button[text()='Remove']");
    final static By SUCCESS_REMOVING_CHECKBOX_MESSAGE = By.xpath("//p[text()=\"It's gone!\"]");
    final static By SUCCESS_ADDING_CHECKBOX_MESSAGE = By.xpath("//p[text()=\"It's back!\"]");
    final static By SUCCESS_ENABLE_INPUT = By.xpath("//p[text()=\"It's enabled!\"]");
    final static By SUCCESS_DISABLE_INPUT = By.xpath("//p[text()=\"It's disabled!\"]");

}
