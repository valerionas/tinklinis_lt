package lt.valentinas.pom.tests.tinklinis_lt;

import lt.valentinas.pom.pages.tinklinis_lt.CartPage;
import lt.valentinas.pom.pages.tinklinis_lt.IndexPage;
import lt.valentinas.pom.pages.tinklinis_lt.ProductPage;
import lt.valentinas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddToCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        IndexPage.open("https://tinklinis.lt/");
    }

    @Test
    public void testAddToCart() {
        List<String> listTitlesInPopular = new ArrayList<>(IndexPage.getTitlesOfPopularProducts());

        IndexPage.clickOnFirstItemInPopular();
        ProductPage.selectSizeAndNumberIfApplicable();
        ProductPage.clickOnAddToCartButton();
        IndexPage.navigateIndex();

        IndexPage.clickOnSecondItemInPopular();
        ProductPage.selectSizeAndNumberIfApplicable();
        ProductPage.clickOnAddToCartButton();

        ProductPage.clickOnGoToCartButtonInAlert();
        List<String> listTitlesInCart;
        listTitlesInCart = CartPage.getTitlesOfAddedProducts();

        Assert.assertTrue(listTitlesInCart.get(0).contains(listTitlesInPopular.get(0)));
        Assert.assertTrue(listTitlesInCart.get(1).contains(listTitlesInPopular.get(1)));


//        String expectedResult = ;
//        String actualResult = ;

//        Assert.assertTrue(
//                actualResult.contains(expectedResult),
//                "\nExpected: %s,\nActual: %s\n".formatted(expectedResult, actualResult)
//        );
    }


}
