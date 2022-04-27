package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class SearchPage {
    public static WebElement element = null;

    /**
     * Returns the flight origin text box element
     * @param driver
     * @return
     */
    public static WebElement originTextBox(WebDriver driver) {
        element = driver.findElement(By.id("fsc-origin-search"));
        return element;
    }

    /**
     * Fills the origin text box element
     * @param driver
     * @param origin
     */
    public static void fillOriginTextBox(WebDriver driver, String origin) {
        element = originTextBox(driver);
        element.sendKeys(origin);
    }

    /**
     * Returns the flight destination text box element
     * @param driver
     * @return
     */
    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.id("fsc-destination-search"));
        return element;
    }

    /**
     * Fills the destination text box element
     * @param driver
     * @param origin
     */
    public static void fillDestinationTextBox(WebDriver driver, String origin) {
        element = destinationTextBox(driver);
        element.sendKeys(origin);
    }

//    /**
//     * Chooses the departure date
//     * @param driver
//     * @return
//     */
//    public static WebElement chooseDepartureDateTextBox(WebDriver driver, LocalDate date) {
//        String year = String.valueOf(date.getYear());
//        String month = String.valueOf(date.getMonthValue());
//        String day = String.valueOf(date.getDayOfMonth());
//
//        driver.findElement(By.id("depart-fsc-datepicker-button")).click();
//
//
//        return element;
//    }
//
//    /**
//     * Returns the retirn date text box element
//     * @param driver
//     * @return
//     */
//    public static WebElement returnDateTextBox(WebDriver driver) {
//        element = driver.findElement(By.id("flight-returning"));
//        return element;
//    }

    /**
     * Returns the search button box element
     * @param driver
     * @return
     */
    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }

    /**
     * Click on search button
     * @param driver
     */
    public static void clickOnSearchButton(WebDriver driver) {
        element = searchButton(driver);
        element.click();
    }
}
