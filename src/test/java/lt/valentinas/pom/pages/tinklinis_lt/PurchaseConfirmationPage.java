package lt.valentinas.pom.pages.tinklinis_lt;

import lt.valentinas.pom.pages.Common;
import lt.valentinas.pom.pages.Locators;
import lt.valentinas.pom.utils.Utils;

public class PurchaseConfirmationPage {

    public static void writeName(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputName, input);
    }

    public static void writeSurname(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputSurname, input);
    }

    public static void writeBillingAddress(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputBillingAdress, input);
    }

    public static void writeCity(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputCity, input);
    }

    public static void writePostalCode(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputPostalCode, input);
    }

    public static void writePhoneNumber(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputPhoneNumber, input);
    }

    public static void writeEmail(String input) {
        Common.writeToElement(Locators.Tinklinis_lt.PurchaseConfirmation.inputEmail, input);
    }

    public static void clickOnPlaceOrderButton() {
        Common.waitChange(Locators.Tinklinis_lt.PurchaseConfirmation.buttonPlaceOrder, 7);
        Common.clickOnElement(Locators.Tinklinis_lt.PurchaseConfirmation.buttonPlaceOrder);
        Common.waitPageLoaded(7);
    }

    public static Double readTotalPrice() {
        return Utils.parseNumberFromString(
                Common.getTextFromElement(Locators.Tinklinis_lt.PurchaseConfirmation.textTotalPrice)
        );
    }

}
