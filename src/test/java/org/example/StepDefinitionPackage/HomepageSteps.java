package org.example.StepDefinitionPackage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {
    Homepage homepage = new Homepage();

    @Given("^user is on the homepage of argos website\\.$")
    public void user_is_on_the_homepage_of_argos_website() throws Throwable {
        homepage.homePageURL();
    }

    @When("^user wants to search for product\\.$")
    public void user_wants_to_search_for_product() throws Throwable {
        homepage.doSearch("nike");
    }

    @Then("^user should see all the relavent searched produts\\.$")
    public void user_should_see_all_the_relavent_searched_produts() throws Throwable {
        homepage.resultOfSearch();
    }

    @When("^user clicks on the account button\\.$")
    public void userClicksOnTheAccountButton() {
        homepage.clickOnAccountButton();
    }

    @Then("^user should see teh detail of account\\.$")
    public void userShouldSeeTehDetailOfAccount() {
    }

    @When("^user try to find multiple \"([^\"]*)\"\\.$")
    public void userTryToFindMultiple(String item) throws Throwable {
        homepage.doSearch(item);
    }
}
