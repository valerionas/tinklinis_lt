package lt.valentinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public class Tinklinis_lt {

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
        }

        public class Cart {
            public static By titlesOfAddedItems = By.xpath("//td[@class='product-name']/a");
        }
    }
}
