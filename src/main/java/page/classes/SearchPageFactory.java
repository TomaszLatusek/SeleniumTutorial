package page.classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='?pwaLob=wizard-flight-pwa']")
    WebElement flightsTab;
    @FindBy(xpath = "//a[@href='?flightType=roundtrip']")
    WebElement returnTrip;

    @FindBy(xpath = "//a[@href='?flightType=oneway']")
    WebElement oneWayTrip;

    @FindBy(xpath = "//a[@href='?flightType=multicity']")
    WebElement multiCityTrip;

    @FindBy(xpath = "//button[@aria-label='Leaving from']")
    WebElement originCity;

    @FindBy(id="location-field-leg1-origin")
    WebElement originCityInput;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    WebElement destinationCity;

    @FindBy(id="location-field-leg1-destination")
    WebElement destinationCityInput;


    public SearchPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightTab() {
        flightsTab.click();
    }

    public void clickReturnTrip() {
        returnTrip.click();
    }

    public void clickOneWayTrip() {
        oneWayTrip.click();
    }

    public void clickMultiCityTrip() {
        multiCityTrip.click();
    }

    public void setOriginCity(String origin) {
        originCity.click();
        originCityInput.sendKeys(origin + Keys.ENTER);
    }

    public void setDestinationCity(String destination) {
        destinationCity.click();
        destinationCityInput.sendKeys(destination + Keys.ENTER);

    }

}
