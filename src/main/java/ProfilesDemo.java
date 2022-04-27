import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import java.io.File;

public class ProfilesDemo {

    public static void main(String[] args) {

        //FIREFOX PROFILE
//        String baseUrl = "http://letskodeit.com";
//
//        ProfilesIni profile = new ProfilesIni();
//        FirefoxProfile fxProfile = profile.getProfile("automationprofile");
//
//        FirefoxOptions options = new FirefoxOptions();
//        options.setProfile(fxProfile);
//
//        WebDriver driver = new FirefoxDriver(options);
//        driver.manage().window().maximize();
//        driver.get(baseUrl);


        //CHROME PROFILE
        String baseUrl = "http://letskodeit.com";

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\tomas\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek\\0.10_0.crx"));

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
}
