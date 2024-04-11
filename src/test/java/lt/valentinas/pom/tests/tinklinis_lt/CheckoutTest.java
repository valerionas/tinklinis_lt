package lt.valentinas.pom.tests.tinklinis_lt;

import lt.valentinas.pom.pages.tinklinis_lt.CartPage;
import lt.valentinas.pom.pages.tinklinis_lt.IndexPage;
import lt.valentinas.pom.pages.tinklinis_lt.ProductPage;
import lt.valentinas.pom.pages.tinklinis_lt.PurchaseConfirmationPage;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        IndexPage.open("https://tinklinis.lt/");
    }

    @Test
    public void testCheckoutForm_ProvidedCorrectInput() {
        String expectedResult = null;
        String actualResult = null;
        String inputName = "Valentinas";
        String inputSurname = "Pusvaskis";
        String inputBillingAddress = "Vyduno 17";
        String inputCity = "Vilnius";
        String inputPostalCode = "12345";
        String inputPhoneNumber = "+37060840207";
        String inputEmail = "valiuspus@gmail.com";
        int i = 0;

        while (true) {
            IndexPage.clickOnProductByIndex(i);
            ProductPage.selectSizeAndNumberIfApplicable();
            ProductPage.clickOnAddToCartButton();

            if (ProductPage.checkIfProductIsInStock()) {
                break;
            } else {
                IndexPage.navigateIndex();
                i++;
            }
        }

        ProductPage.clickOnGoToCartButtonInAlert();
        Double totalPriceInCart = CartPage.readTotalPrice();
        CartPage.clickOnContinuePurchaseButton();

        PurchaseConfirmationPage.writeName(inputName);
        PurchaseConfirmationPage.writeSurname(inputSurname);
        PurchaseConfirmationPage.writeBillingAddress(inputBillingAddress);
        PurchaseConfirmationPage.writeCity(inputCity);
        PurchaseConfirmationPage.writePostalCode(inputPostalCode);
        PurchaseConfirmationPage.writePhoneNumber(inputPhoneNumber);
        PurchaseConfirmationPage.writeEmail(inputEmail);

        PurchaseConfirmationPage.clickOnPlaceOrderButton();
        Double totalPriceInCheque = PurchaseConfirmationPage.readTotalPrice();


        Assert.assertEquals(totalPriceInCheque, totalPriceInCart,
                "\nPrice in cheque: %s,\nPrice in cart: %s\n".formatted(totalPriceInCheque, totalPriceInCart)
        );
    }


}
