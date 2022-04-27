package javascriptexecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecution {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://courses.letskodeit.com/practice";
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testJavaScriptExecution() {
//        driver.get(baseUrl);
        js.executeScript("window.location = 'https://courses.letskodeit.com/practice';");

//        WebElement textBox = driver.findElement(By.id("name"));
        WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
        textBox.sendKeys("test");
    }
}
