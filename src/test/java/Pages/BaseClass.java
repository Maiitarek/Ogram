package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

    public static WebDriver driver;
    public static  WebDriver getDriver(){
        return driver;
    };


    @BeforeClass
    public void setupApplication(){


        Reporter.log("=====Browser Session Started=====", true);

        System.setProperty("webdriver.chrome.driver","./Tools\\chromedriver.exe");



            driver = new ChromeDriver();
            driver.manage().window().maximize();



        driver.get("https://app.ogram.co/uae/start?lng=en");

        Reporter.log("=====Application Started=====", true);

    }

    @AfterClass
    public void closeApplication()
    {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }


}
