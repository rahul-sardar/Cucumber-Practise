package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingStep {

	@Given("User want to select a car type {string} from uber application")
	public void user_want_to_select_a_car_type_from_uber_application(String carType) {
	    System.out.println("User Selected Car Type is " +carType);
		
		
	}

	@When("User Select car {string} and pick up point {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickLocation, String dropLocation) {
	    System.out.println("User Select a Car Type of " +carType
	    		+ " and Pick up location is " +pickLocation + " and Drop Location is " +dropLocation);
	}

	@Then("Driver Start the Journey")
	public void driver_start_the_journey() {
	    System.out.println("Driver Start the journey");
	}

	@Then("Driver Ends the Journey")
	public void driver_ends_the_journey() {
	    System.out.println("Driver End the Journey");
	}

	@Then("User Pays {int} USD")
	public void user_pays_usd(Integer payment) {
	    System.out.println("User Pays: " +payment);
	}

	
	
}
