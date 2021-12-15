package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BillingStringSteps {

	double billingAmount;
	double taxAmount;
	double totalAmount;
	
	
	@Given("User is on Billing Page")
	public void user_is_on_billing_page() {
	    
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
	    this.billingAmount = Double.parseDouble(billingAmount);
	}
	
	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	    
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String finalAmount) {
		this.totalAmount = this.billingAmount + this.taxAmount;
		System.out.println("Expected Final Amount is "+Double.parseDouble(finalAmount));
		System.out.println("Calculated Final Amount is "+this.totalAmount);
		Assert.assertTrue(totalAmount == Double.parseDouble(finalAmount));
	    
	}
	
	
	
}
