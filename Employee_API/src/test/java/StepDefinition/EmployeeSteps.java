package StepDefinition;

import Employess_Pages.GetData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeSteps {
	
	public EmployeeSteps(GetData data) {
		this.data = data;
	}
	
	GetData data = new GetData();

	@Given("^GET all employee service api endpoint$")
	public void i_set_get_all_employee_service_api_endpoint() throws Throwable {
		data.GetBaseURL();
	}

	@When("^Send a GET HTTP request$")
	public void send_a_get_http_request() throws Throwable {
		data.GetRequest();
	}

	@Then("^I receive get valid Response$")
	public void i_receive_get_valid_response() throws Throwable {
		data.GetResponse();
	}

}
