package gov.cowin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.cowin.baseClass.BaseClass;
import com.cowin.managers.FileReaderManager;
import com.cowin.managers.PageObjectManager;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterTestSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("user Lounch Url")
	public void user_lounch_url() throws Exception {

	geturl(FileReaderManager.getInstance().getConfigReader().getUrl());
		
	}

	@Given("user Scroll Down To Search Url")
	public void user_scroll_down_to_search_url() {

	}

	@When("user Filter {string} in state Search Bar")
	public void user_filter_in_state_search_bar(String string) {

	}

	@When("user Filter {string} in city Search Bar")
	public void user_filter_in_city_search_bar(String string) {

	}

	@Then("user Click Search Button")
	public void user_click_search_button() {

	}

	@When("user Get All List In Age Filter")
	public void user_get_all_list_in_age_filter() {

	}

	@When("user Check \"{int}+\"is in the Age list or not")
	public void user_check_is_in_the_age_list_or_not(Integer int1) {

	}

	@Then("print given Value In The Age List")
	public void print_given_value_in_the_age_list() {

	}

	@When("user Get All List In Does Filter")
	public void user_get_all_list_in_does_filter() {

	}

	@When("user Check {string} is in the Dose list or not")
	public void user_check_is_in_the_dose_list_or_not(String string) {

	}

	@Then("print given Value In The Dose List")
	public void print_given_value_in_the_dose_list() {

	}

	@When("user Get All List In Cost Filter")
	public void user_get_all_list_in_cost_filter() {

	}

	@When("user Check {string} is in the Cost list or not")
	public void user_check_is_in_the_cost_list_or_not(String string) {

	}

	@Then("print given Value In The Cost List")
	public void print_given_value_in_the_cost_list() {

	}

	@When("user Get All List In Vaccine Filter")
	public void user_get_all_list_in_vaccine_filter() {

	}

	@When("user Check {string} is in the Vaccine  list or not")
	public void user_check_is_in_the_vaccine_list_or_not(String string) {

	}

	@Then("print given Value In The Vaccine List")
	public void print_given_value_in_the_vaccine_list() {

	}

}
