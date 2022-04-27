package usefulmethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GenericMethodsDemo {

    private WebDriver driver;
    private String baseUrl;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://courses.letskodeit.com/practice";
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testGetText() {
        driver.get(baseUrl);

//        WebElement element = gm.getElement("name","id");
//        element.sendKeys("test");

//        List<WebElement> elements = gm.getElementList("//input[@type='text']","xpath");
//        System.out.printf(String.valueOf(elements.size()));

        System.out.println("Is element present: " + gm.isElementPresent("name", "id"));
        System.out.println("Is element present: " + gm.isElementPresent("dupa", "id"));
    }
}
