package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;
import org.openqa.selenium.Keys;

import java.util.List;

public class IndexPage {
    public static void open(String url) {
        Common.setUpChrome(7);
        Common.openUrl(url);
    }

    public static void clickOnSearchIcon() {
        Common.clickOnElement(Locators.Tinklinis_lt.Index.iconSearch);
    }

    public static void searchByPhrase(String input) {
        Common.sendKeysToElement(Locators.Tinklinis_lt.Index.inputSearch, input + Keys.ENTER);
        Common.waitPageLoaded(7);
    }

    public static void clickOnFirstItemInPopular() {
        Common.clickOnElement(Locators.Tinklinis_lt.Index.linkOfFirstItemInPopular);
        Common.waitPageLoaded(7);
    }

    public static void clickOnSecondItemInPopular() {
        Common.clickOnElement(Locators.Tinklinis_lt.Index.linkOfSecondItemInPopular);
        Common.waitPageLoaded(7);
    }

    public static void navigateIndex() {
        Common.navigateIndex();
        Common.waitPageLoaded(7);
    }

    public static List<String> getTitlesOfPopularProducts() {
        return Common.getAllProductsTitles(Locators.Tinklinis_lt.Index.titlesOfPopularProducts);
    }
}
