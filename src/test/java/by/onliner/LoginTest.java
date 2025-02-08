package by.onliner;

import by.onliner.pages.LoginPage;
import by.onliner.singleton.Singleton;
import by.onliner.steps.HomeStep;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @BeforeEach
    public void beforeEach() {
        new HomeStep().openLoginPage();
    }

    @Test
    public void testLoginIsOpened() {
        Assertions.assertEquals("Вход", new LoginPage().getTitleText());
    }

    @AfterEach
    public void tearsDown() {
        Singleton.quit();
    }
}
