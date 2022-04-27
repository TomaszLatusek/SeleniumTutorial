import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class RadioButtonsAndCheckboxes {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

//    @Test
//    public void test() throws InterruptedException {
//        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
//        bmwRadioBtn.click();
//        Thread.sleep(2000);
//
//        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
//        benzRadioBtn.click();
//        Thread.sleep(2000);
//
//        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
//        bmwCheckBox.click();
//
//        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
//        benzCheckBox.click();
//    }

//    @Test
//    public void testListOfElements() throws InterruptedException {
//        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio' and @name='cars']"));
//        for(WebElement radioBtn : radioButtons){
//            if(!radioBtn.isSelected()){
//                radioBtn.click();
//                Thread.sleep(1000);
//            }
//        }
//    }


//    @Test
//    public void testDropdown() throws InterruptedException {
//        WebElement element = driver.findElement(By.id("carselect"));
//        Select select = new Select(element);
//
//        select.selectByValue("benz");
//        Thread.sleep(2000);
//
//        select.selectByIndex(2);
//        Thread.sleep(2000);
//
//        select.selectByVisibleText("BMW");
//        Thread.sleep(2000);
//
//        List<WebElement> options = select.getOptions();
//    }


    @Test
    public void testLetsKodeIt() throws InterruptedException {
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text box displayed: " + textBox.isDisplayed());

        Thread.sleep(2000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Clicked on hide button");
        System.out.println("Text box displayed: " + textBox.isDisplayed());

        Thread.sleep(2000);

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Clicked on show text button");
        System.out.println("Text box displayed: " + textBox.isDisplayed());


    }
}
