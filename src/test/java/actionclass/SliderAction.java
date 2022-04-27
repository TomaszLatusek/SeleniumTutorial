package actionclass;

import com.beust.ah.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderAction {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://jqueryui.com/slider/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @After
    public void tearDown() throws Exception {
//        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void testSliderAction() throws InterruptedException {
        driver.get(baseUrl);
        driver.switchTo().frame(0);

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));

        Actions action = new Actions(driver);

        action.dragAndDropBy(slider, 100, 0).perform();
    }
}
