package switchto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SwitchWindow {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get(baseUrl);

        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);

        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
                searchBox.sendKeys("python");
                driver.close();
                break;
            }
        }
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("Test successful");
    }
}
