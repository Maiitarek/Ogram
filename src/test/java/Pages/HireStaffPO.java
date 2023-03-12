package Pages;

import org.apache.xerces.impl.xs.identity.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class HireStaffPO extends BaseClass{

   public HireStaffPO()
   {
      driver = BaseClass.driver;
   };

   WebElement searchInput = driver.findElement(By.xpath("//div[@class='SearchInput ']/child::input"));

   @FindBy(how = How.CLASS_NAME,using = "Button Stepper__rightContainer__backButton  ")
   WebElement backButton;

   List <WebElement> StaffType= driver.findElements(By.xpath("//div[@class='JobDraftCategory']/div[@class='JobDraftCategory__list']//child::span"));

}
