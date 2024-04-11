package lt.valentinas.pom.pages;

import lt.valentinas.pom.utils.Driver;
import lt.valentinas.pom.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChrome();
    }

    public static void setUpChrome(int waitSeconds) {
        Driver.setUpChrome();
        Driver.getChromeDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitSeconds));
    }

    public static void openUrl(String url) {
        Driver.getChromeDriver().get(url);
    }

    public static void quitChromeDriver() {
        Driver.quitChromeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getChromeDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getChromeDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void waitPageLoaded(int waitSeconds) {
        Driver.getChromeDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitSeconds));
    }

    public static boolean waitElementPresent(By locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static boolean waitElementVisible(By locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static boolean isElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean isElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> isElementGroupSelected(By locator) {
        List<Boolean> list = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            list.add(element.isSelected());
        }

        return list;
    }

    public static void doubleClickOnElementByAction(By locator) {
        Actions action = new Actions(Driver.getChromeDriver());
        action.
                moveToElement(getElement(locator)).
                doubleClick().
                perform();
    }

    public static void clickOnElementByAction(By locator) {
        Actions action = new Actions(Driver.getChromeDriver());
        action.
                moveToElement(getElement(locator)).
                click().
                perform();
    }

    public static void rightClickOnElementByAction(By locator) {
        Actions action = new Actions(Driver.getChromeDriver());
        action.
                moveToElement(getElement(locator)).
                contextClick().
                perform();
    }

    public static List<String> getAllProductsTitles(By locator) {
        String text;
        List<String> listOfTitles = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            text = Utils.deLithuaniseStringToLower(element.getText());
            listOfTitles.add(text);
        }
        return listOfTitles;
    }

    public static void navigateIndex() {
        Driver.getChromeDriver().navigate().to("https://tinklinis.lt/");
    }

    public static boolean isElementPresent(By locator) {
        return !getElements(locator).isEmpty();
    }

    public static void selectFromSelectTag(By locator, int optionIndex) {
        Select dropdown = new Select(getElement(locator));
        dropdown.selectByIndex(optionIndex);
    }

    public static void writeToElement(By locator, String input) {
        getElement(locator).sendKeys(input);
    }

    public static boolean waitChange(By locator, int seconds) {
        List<WebElement> previousState = getElements(locator);

        for (int i = 0; i < seconds * 2; i++) {
            if (getElements(locator).equals(previousState)) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void clickOnProductByIndex(By locatorOfSeveralElements, int index) {
        WebElement element = getElements(locatorOfSeveralElements).get(index);
        element.click();
    }
}
