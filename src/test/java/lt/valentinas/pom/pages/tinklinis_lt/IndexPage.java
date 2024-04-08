package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;
import org.openqa.selenium.Keys;

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
    }
}
