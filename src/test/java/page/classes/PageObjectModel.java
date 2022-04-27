package page.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.skyscanner.pl/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
    }

    @Test
    public void test() {
        driver.get(baseUrl);
        driver.findElement(By.id("acceptCookieButton")).click();

        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.destinationTextBox(driver).sendKeys("Chicago");
//        SearchPage.departureDateTextBox(driver).sendKeys("12/05/2022");
//        SearchPage.returnDateTextBox(driver).sendKeys("17/05/2022");
        SearchPage.clickOnSearchButton(driver);
    }
}
