package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepdefs {
    @Given("the user open {string} browser")
    public void the_user_open_browser(String browsertype) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_open_browser: "+ browsertype);
    }

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_navigates_to "+ url);
    }

    @Then("the user should be in home page")
    public void the_user_should_be_in_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_should_be_in_home_page");
    }

    @Given("the user on the user registration page")
    public void the_user_on_the_user_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_on_the_user_registration_page");
    }

    @When("the user enter select registration by email and enter all the required details:")
    public void the_user_enter_select_registration_by_email_and_enter_all_the_required_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("the_user_enter_select_registration_by_email_and_enter_all_the_required_details");
    }

    @Then("the user registration should be successful.")
    public void the_user_registration_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_registration_should_be_successful");
    }

    @When("the user enter select registration by phone and enter all the required details:")
    public void the_user_enter_select_registration_by_phone_and_enter_all_the_required_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("the_user_enter_select_registration_by_phone_and_enter_all_the_required_details");
    }

    @Given("the user on the user sign in page")
    public void the_user_on_the_user_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_on_the_user_sign_in_page");
    }

    @When("the user enter her {string} and {string}")
    public void the_user_enter_her_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_enter_her_and");
    }

    @Then("the user login should be successful.")
    public void the_user_login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_login_should_be_successful");
    }

}
