package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BaseTest;

public class loginStep extends BaseTest {


    @Given("the user open {string} browser")
    public void the_user_open_browser(String browser) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("the user should be in home page")
    public void the_user_should_be_in_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertEquals("the user should be in home page",true,true);
    }
    @Given("the user on the user registration page")
    public void the_user_on_the_user_registration_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("the user enter select registration by email and enter all the required details")
    public void the_user_enter_select_registration_by_email_and_enter_all_the_required_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @Then("the user registration should be successful.")
    public void the_user_registration_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions

    }

}
