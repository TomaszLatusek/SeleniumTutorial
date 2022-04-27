package genericexplicitwait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
    private WebDriver driver;
    private String baseUrl;
    private WaitTypes wt;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://courses.letskodeit.com/practice";
        wt = new WaitTypes(driver);

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testGetText() {
        driver.get(baseUrl);
        WebElement loginLink = driver.findElement(By.xpath("//a[@href='/login']"));
        loginLink.click();

        WebElement emailFailed = wt.waitForElement(By.xpath("//input[@placeholder='Email Address']"), 3);
        emailFailed.sendKeys("test");

        wt.clickWhenReady(By.xpath("//input[@value='Login']"), 3);
    }
}
