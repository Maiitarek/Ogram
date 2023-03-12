package Pages;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;


public class HireStaffLogic extends HireStaffPO {



    public void searchStaffType(String staffType) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        //entering the staff type to search for Ex:Waiter
        searchInput.sendKeys(staffType);
        //click on the staff type
        driver.findElement(By.xpath("//div[@class='JobDraftCategory']/div[@class='JobDraftCategory__list']//child::span")).click();
        System.out.println("Searched for **********" + staffType + "******* Successfully  ********PASS ********");
        driver.navigate().back();

    }

    public void SelectStaff() {

        WebDriverWait wait = new WebDriverWait(driver, 20);

            for (int i = 1; i <= StaffType.size(); i++) {

                /*Getting the list of items again so that when the page is
                navigated back to, then the list of items will be refreshed
                again */
                StaffType = driver.findElements(By.xpath("//div[@class='JobDraftCategory']/div[@class='JobDraftCategory__list']//child::span"));
                //Waiting for the element to be visible
                //Used (i-1) because the list's item start with 0th index, like in an array
                wait.until(ExpectedConditions.visibilityOf(StaffType.get(i-1)));
                //Clicking on the first element
                StaffType.get(i-1).click();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                System.out.print(i + " element clicked\t--");
                System.out.println("pass");
                driver.navigate().back();


            }
            }
        }
