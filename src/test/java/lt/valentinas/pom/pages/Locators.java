package lt.valentinas.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public class Tinklinis_lt {

        public class Index {
            public static By iconSearch = By.xpath("//a[@class='slide-search astra-search-icon']");
            public static By inputSearch = By.xpath("//input[@class='search-field']");
        }

        public class Search {
            public static By productsTitles = By.xpath("//h2[@class='entry-title']/a[@href]");
        }
    }
}
