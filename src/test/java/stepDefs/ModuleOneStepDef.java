package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {

	@Given("User is loggedIn")
	public void user_is_logged_in() {
		System.out.println("User is loggedIn");
	}

	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}

	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view contact details");
	}

	@When("User update a contact details")
	public void user_update_a_contact_details() {
		System.out.println("User update a contact details");
	}
	@When("User create a new Deal")
	public void user_create_a_new_deal() {
		System.out.println("User create a new Deal");
	}

	@When("User view Deal details")
	public void user_view_deal_details() {
		System.out.println("User view Deal details");
	}

	@When("User update a Deal details")
	public void user_update_a_deal_details() {
		System.out.println("User update a Deal details");
	}

	
	@When("User logout from App")
	public void user_logout_from_app() {
		System.out.println("User logout from App");
	}

}
