package Pages;

import org.openqa.selenium.By;
import org.apache.xerces.impl.xs.identity.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPO extends BaseClass{

    public SignInPO(){

        driver = BaseClass.driver;
    }
    WebElement email = driver.findElement(By.xpath("//div[@class='Input ']/child::input[@type='email']"));
    WebElement password = driver.findElement(By.xpath("//div[@class='Input ']/child::input[@type='password']"));
    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
    String expected ="https://app.ogram.co/uae/";
    String current="https://app.ogram.co/uae/";
}
