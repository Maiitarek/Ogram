package Pages;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SignInLogic extends SignInPO{

    public void validSignIn(String mail, String pass) {

        WebElement signInPassed;
        email.sendKeys(mail);
        password.sendKeys(pass);
        submit.click();
        //signInPassed = driver.findElement(By.xpath(signInP));
        //new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(signInPassed));
        //Assert.assertTrue("PASS", signInPassed.isDisplayed());
        Assert.assertEquals(expected,driver.getCurrentUrl());
    }

    public void invalidSignIn(String mail, String pass){

        WebElement wrongPassword;
        WebDriverWait wait = new WebDriverWait(driver, 20);
        email.sendKeys(mail);
        password.sendKeys(pass);
        submit.click();
        Assert.assertEquals(current,driver.getCurrentUrl());

    }

}
