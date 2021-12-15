package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {

	@Before(order=1) //@Before("Smoke")
	public void setup_browser() {
		System.out.println("Launch Browser ");
	}
	
	@Before(order=2)
	public void setup_url() {
		System.out.println("Launch Amazon Application");
	}
	
	
	@After(order=1)
	public void tearDown_logout() {
		System.out.println("Logout the User");
	}
	

	@After(order=2)
	public void tearDown_Browser() {
		System.out.println("Close the Browser");
	}
	
	@BeforeStep
	public void takescreenshot() {
		System.out.println("Take the Screenshot");
	}
	
	@AfterStep
	public void refreshPage() {
		System.out.println("Refresh the Page");
	}
	
	
	
}
