package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;
import lt.valentinas.pom.utils.Utils;

import java.util.List;

public class CartPage {


    public static List<String> getTitlesOfAddedProducts() {
        return Common.getAllProductsTitles(Locators.Tinklinis_lt.Cart.titlesOfAddedItems);
    }

    public static void clickOnContinuePurchaseButton() {
        Common.clickOnElement(Locators.Tinklinis_lt.Cart.buttonContinuePurchase);
        Common.waitPageLoaded(7);
    }

    public static Double readTotalPrice() {
        return Utils.parseNumberFromString(Common.getTextFromElement(Locators.Tinklinis_lt.Cart.textTotalCartPrice));
    }
}
