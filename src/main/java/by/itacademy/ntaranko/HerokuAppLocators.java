package by.itacademy.ntaranko;

import org.openqa.selenium.By;

public class HerokuAppLocators {
    public static final By CHECKBOX_A = By.cssSelector("input[type=\"checkbox\"]");
    public static final By BUTTON_REMOVE_ADD = By.cssSelector("[onclick=\"swapCheckbox()\"]");
    public static final By MESSAGE_It_S_GONE_BACK = By.cssSelector("p#message");
}
