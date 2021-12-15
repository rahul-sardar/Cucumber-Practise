package StepDefinition;


import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchSteps {

	Product product;
	Search search;
	
	@Given("I have a search feild on amazon page")
	public void i_have_a_search_feild_on_amazon_page() {
	   System.out.println("Step 1: I am on search page");
	}
    
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	//@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Search the product with name:" +productName + 
				" price: "+price);
		product = new Product(productName, price);
		
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3:  Product with name:" +productName + 
				" is Displayed ");
		
		search = new Search();
		String productReturn= search.displayProduct(product);
		Assert.assertEquals(product.getProductName(), productReturn);
		
		
	}
	
	
}
