package StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on Registration Page")
	public void user_is_on_registration_page() {
	   System.out.println("User is on Registration page");
	}

	@When("User Enter Following User Details")
	public void user_enter_following_user_details(DataTable dataTable) {
		List< List<String> > userList = dataTable.asLists(String.class);
		for (List<String> e: userList) {
			System.out.println(e);
			
		}
	   
	}
	
	@When("User Enter Following User Details with columns")
	public void user_enter_following_user_details_with_columns(DataTable dataTable) {
	    
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> e : userList) {
			System.out.println(e.get("fisrtname"));
			System.out.println(e.get("Lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("PhoneNumber"));
			System.out.println(e.get("City"));
		}
	}


	@Then("User Registration Should Be Successful")
	public void user_registration_should_be_successful() {
	   System.out.println("User is Register Succcessfully");
	}
	
	
	
	
}
