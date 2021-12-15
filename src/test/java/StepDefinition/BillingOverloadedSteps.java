package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BillingOverloadedSteps {
    
	
	double billingAmount;
	double taxAmount;
	double totalAmount;
	
	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer billingAmount) {
		 this.billingAmount = billingAmount;
	}

	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
    
	@When("user clicks on calculate Button")
	public void user_clicks_on_calculate_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer int1) {
	   
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double finalAmount) {
		this.totalAmount = this.billingAmount + this.taxAmount;
		System.out.println("Expected Final Amount is "+finalAmount);
		System.out.println("Calculated Final Amount is "+this.totalAmount);
		Assert.assertTrue(totalAmount == finalAmount);
	}

	
	
	
}
