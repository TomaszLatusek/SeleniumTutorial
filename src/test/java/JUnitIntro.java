import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JUnitIntro {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]//a[@href=\"/sign_in\"]")).click();
        System.out.println("Clicked on login");
        driver.findElement(By.id("email")).clear();
        System.out.println("Clearing the username field");
        driver.findElement(By.id("email")).sendKeys("dupadupa@gmail.com");
        System.out.println("Sending keys to username field");
        driver.findElement(By.id("password")).sendKeys("dupa");
        System.out.println("Sending keys to password field");
    }
}
