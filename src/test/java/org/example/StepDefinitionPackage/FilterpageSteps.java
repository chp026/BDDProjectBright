package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Filterpage;
import org.example.PageObjectPackage.Homepage;
import org.example.PageObjectPackage.Resultpage;

public class FilterpageSteps {
    Resultpage resultPage = new Resultpage();
    Homepage homepage = new Homepage();
    Filterpage filterpage = new Filterpage();

    @Given("^user is on the result page of running filter\\.$")
    public void user_is_on_the_result_page_of_running_filter() throws Throwable {
        Thread.sleep(5000);
        filterpage.runningTitleAssert();
    }

    @When("^user click on name of the product\\.$")
    public void user_click_on_name_of_the_product() throws Throwable {
        filterpage.product();
    }

    @Then("^user should able to see that product to add to bascket\\.$")
    public void user_should_able_to_see_that_product_to_add_to_bascket() throws Throwable {
        Thread.sleep(5000);
        filterpage.armBandAssert();
    }

}
