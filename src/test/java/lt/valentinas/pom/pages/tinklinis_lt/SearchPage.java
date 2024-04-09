package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

import java.util.List;

public class SearchPage {
    public static List<String> getTitlesList() {
        return Common.getAllProductsTitles(Locators.Tinklinis_lt.Search.titlesOfProducts);
    }
}
