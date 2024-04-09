package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

import java.util.List;

public class CartPage {


    public static List<String> getTitlesOfAddedProducts() {
        return Common.getAllProductsTitles(Locators.Tinklinis_lt.Cart.titlesOfAddedItems);
    }
}
