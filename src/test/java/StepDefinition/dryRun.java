package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dryRun {

	
	@Given("User is on Billing Pages")
	public void user_is_on_billing_pages() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am Checking test ");
	}

	@When("user enters billing amount in rupees")
	public void user_enters_billing_amount_in_rupees() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am Checking test ");
	
	}

	@When("user enters tax amount  in rupees")
	public void user_enters_tax_amount_in_rupees() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am Checking test ");
	}

	@When("user clicks on calculate button to get output")
	public void user_clicks_on_calculate_button_to_get_output() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am Checking test ");
	}

	@Then("it gives the final amount in rupees")
	public void it_gives_the_final_amount_in_rupees() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am Checking test ");
	}

}
