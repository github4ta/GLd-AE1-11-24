package by.onliner.steps;

import by.onliner.pages.CookiePage;
import by.onliner.pages.HomePage;

public class HomeStep {

    public HomeStep() {

    }

    public void openLoginPage() {
        HomePage homePage = new HomePage();
        homePage.open();

        CookiePage cookiePage = new CookiePage();
        cookiePage.clickCookie();

        homePage = new HomePage();
        homePage.clickButtonLogin();
    }
}
