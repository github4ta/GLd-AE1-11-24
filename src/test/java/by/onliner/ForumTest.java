package by.onliner;

import by.onliner.pages.ForumPage;
import by.onliner.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTest {

    @Test
    public void test() {

        ForumPage forumPage = new ForumPage();
        forumPage.open();

        forumPage.clickForum();
        String actual = forumPage.getTextForum();
        Assertions.assertEquals("Форум", actual);

    }

    @AfterEach
    public void afterEach() {
        Singleton.quit();
    }
}
