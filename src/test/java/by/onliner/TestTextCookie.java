package by.onliner;//

import by.onliner.pages.SettingCookie;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.*;

public class TestTextCookie {
    @BeforeEach
    public void beforeEach() {
        new SettingCookie().open();
    }

    @Test
    @DisplayName("We check the presence of the title and the text in it.")
    public void getTextCookieTitle() {
        Assertions.assertEquals("Мы используем cookie, чтобы сделать сайт удобнее", new SettingCookie().getTextCookieTitle());
    }

    @AfterEach
    public void afterEach(){
        Singleton.quit();
    }
}
