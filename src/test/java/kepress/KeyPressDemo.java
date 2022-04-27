package kepress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class KeyPressDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://sso.teachable.com/secure/42299/identity/login/password";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testKeyPress() {
        driver.get(baseUrl);

        driver.findElement(By.id("email")).sendKeys("dupa");
        driver.findElement(By.id("password")).sendKeys("dupa");
        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);

    }
}
