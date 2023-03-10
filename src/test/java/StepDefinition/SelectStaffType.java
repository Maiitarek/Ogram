package StepDefinition;

import Pages.BaseClass;
import Pages.HireStaffLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectStaffType {


    @Given("I am on start hiring page")
    public void reachURL() {
        BaseClass setBr = new BaseClass();
        setBr.setupApplication();
    }



    @Then("I can select any staff type I need")
    public  void clickOnStaffType(){
        HireStaffLogic H = new HireStaffLogic();
        H.SelectStaff();
    }


    @Then("I can search for {string}")
    public  void searchStaffType(String arg0){
        HireStaffLogic H = new HireStaffLogic();
        H.searchStaffType(arg0);
    }
}
