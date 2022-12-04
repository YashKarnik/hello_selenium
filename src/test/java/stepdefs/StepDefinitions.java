package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("I have  beer cans")
    public void i_have_beer_cans() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hi");
//        throw new io.cucumber.java.PendingException();
    }


    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("hi");

    }


    @Then("I should have beer cans")
    public void i_should_have_in_stock_beer_cans() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("hbi");

    }
    
}
