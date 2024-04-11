package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;

public class ProductPage {
    public static void clickOnAddToCartButton() {
        Common.clickOnElement(Locators.Tinklinis_lt.Product.buttonAddToCart);
        Common.waitElementPresent(Locators.Tinklinis_lt.Product.buttonGoToCartInAlert, 7);
    }

    public static void selectSizeAndNumberIfApplicable() {
        if (Common.isElementPresent(Locators.Tinklinis_lt.Product.dropdownListSize)) {
            Common.selectFromSelectTag(Locators.Tinklinis_lt.Product.dropdownListSize, 1);
        }
        if (Common.isElementPresent(Locators.Tinklinis_lt.Product.dropdownListNumber)) {
            Common.selectFromSelectTag(Locators.Tinklinis_lt.Product.dropdownListNumber, 1);
        }
    }

    public static void clickOnGoToCartButtonInAlert() {
        Common.clickOnElement(Locators.Tinklinis_lt.Product.buttonGoToCartInAlert);
        Common.waitPageLoaded(7);
    }

    public static boolean checkIfProductIsInStock() {
        return !Common.waitElementPresent(Locators.Tinklinis_lt.Product.paragraphOutOfStock, 7);
    }
}
