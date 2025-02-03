package by.onliner;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {

    @Test
    public void testPageOpened(){
        HomePage homePage = new HomePage();
        homePage.open();

        CookiePage cookiePage = new CookiePage();
        cookiePage.clickCookie();

        String actual = homePage.getTextCopyright();
        Assertions.assertEquals("© 2001—2025 Onlíner", actual);
    }
}
