package StepDefinition;

import Pages.BaseClass;
import Pages.SignInLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class SignIn extends BaseClass{



    @Given("I am on Sign In screen")
    public void iAmOnSignInScreen() {

        driver.get("https://app.ogram.co/uae/");
    }


    @Then("I Can Sign in with valid {string} and valid {string}")
    public void validSignIn(String vmail , String vpass) {

        SignInLogic signIn = new SignInLogic();
        signIn.validSignIn(vmail, vpass);
    }


    @Given("I am on Sign In page")
    public void iAmOnSignInPage() {

        signInPage();
    }

    @Then("I Can't Sign in with invalid {string} and valid {string}")
    public void iCanSignInWithInvalidAndValid(String imail, String ipass) {
        SignInLogic signIn = new SignInLogic();
        signIn.invalidSignIn(imail,ipass);
    }
}
