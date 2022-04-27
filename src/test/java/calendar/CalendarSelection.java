package calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CalendarSelection {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get(baseUrl);
        driver.findElement(By.id("d1-btn")).click();

        WebElement dateToSelect = driver.findElement(
                By.xpath("(//div[contains(@class,'uitk-date-picker-menu-container')]//table//button[@data-day='12'])[1]"));
        dateToSelect.click();
    }
}
