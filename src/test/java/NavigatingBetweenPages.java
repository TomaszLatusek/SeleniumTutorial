import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigatingBetweenPages {
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
    public void test() throws InterruptedException {
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current url: " + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/identity/login/password";
        driver.navigate().to(urlToNavigate);

        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
    }
}
