package page.classes;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";
        searchPage = new SearchPageFactory(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test() {
        searchPage.clickFlightTab();
        searchPage.setOriginCity("New York");
        searchPage.setDestinationCity("Chicago");
    }
}
