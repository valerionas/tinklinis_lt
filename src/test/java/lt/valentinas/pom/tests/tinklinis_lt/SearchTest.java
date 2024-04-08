package lt.valentinas.pom.tests.tinklinis_lt;

import lt.valentinas.pom.pages.tinklinis_lt.IndexPage;
import lt.valentinas.pom.pages.tinklinis_lt.SearchPage;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        IndexPage.open("https://tinklinis.lt/");
    }

    @Test
    public void testTitlesOfSearchFeature() {
        String input = "kamuolys";
        List<String> titles = new ArrayList<>();

        IndexPage.clickOnSearchIcon();
        IndexPage.searchByPhrase(input);
        titles = SearchPage.getTitlesList();

        for (String title : titles) {
            Assert.assertTrue(title.contains(input));
        }
    }
}
