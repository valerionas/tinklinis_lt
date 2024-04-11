package lt.valentinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Tinklinis_lt {

        public class Index {
            public static By iconSearch = By.xpath("//a[@class='slide-search astra-search-icon']");
            public static By inputSearch = By.xpath("//input[@class='search-field']");
            public static By linkOfFirstItemInPopular =
                    By.xpath("(//a[@class='ast-loop-product__link'])[1]");
            public static By linkOfSecondItemInPopular =
                    By.xpath("(//a[@class='ast-loop-product__link'])[2]");
            public static By titlesOfPopularProducts =
                    By.xpath("//h2[@class='woocommerce-loop-product__title']");
        }

        public class Search {
            public static By titlesOfProducts = By.xpath("//h2[@class='entry-title']/a[@href]");
        }

        public class Product {
            public static By buttonAddToCart =
                    By.xpath("//button[@class='single_add_to_cart_button button alt']");
            public static By buttonGoToCartInAlert =
                    By.xpath("//div[@class='woocommerce-message']/a[@class='button wc-forward']");
            public static By dropdownListSize = By.xpath("//select[@id='pa_dydis']");
            public static By dropdownListNumber = By.xpath("//select[@id='numeris']");
            public static By paragraphOutOfStock = By.xpath("//p[@class='stock out-of-stock']");
        }

        public class Cart {
            public static By titlesOfAddedItems = By.xpath("//td[@class='product-name']/a");
            public static By buttonContinuePurchase =
                    By.xpath("//a[@class='checkout-button button alt wc-forward']");
            public static By textTotalCartPrice = By.xpath(
                    "//tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']/bdi");
        }

        public class PurchaseConfirmation {
            public static By inputName = By.xpath("//input[@id='billing_first_name']");
            public static By inputSurname = By.xpath("//input[@id='billing_last_name']");
            public static By inputBillingAdress = By.xpath("//input[@id='billing_address_1']");
            public static By inputCity = By.xpath("//input[@id='billing_city']");
            public static By inputPostalCode = By.xpath("//input[@id='billing_postcode']");
            public static By inputPhoneNumber = By.xpath("//input[@id='billing_phone']");
            public static By inputEmail = By.xpath("//input[@id='billing_email']");
            public static By buttonPlaceOrder = By.xpath("//button[@id='place_order']");
            public static By textTotalPrice =
                    By.xpath("//th[text()='Viso:']/..//span[@class='woocommerce-Price-amount amount']");
        }
    }
}
