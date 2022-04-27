package screenshot;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenshotDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://pl-pl.facebook.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() throws Exception {
        String filename = getRandomString(10) + ".png";
        String directory = System.getProperty("user.dir") + "//screenshots//";
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(directory + filename));
        driver.quit();
    }

    @Test
    public void testScreenshots() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
    }

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        for(int i = 0; i < length; i++) {
            int index = (int)(Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
