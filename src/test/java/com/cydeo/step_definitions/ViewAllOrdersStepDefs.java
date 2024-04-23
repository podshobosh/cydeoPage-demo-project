package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewAllOrdersStepDefs extends BasePage {



    @And("user is on the View all Orders page")
    public void user_is_on_the_view_all_orders_page() {
        viewAllOrdersLink.click();
    }
    @When("user clicks the select button")
    public void user_clicks_the_select_button() {

    }
    @Then("all options should be checked")
    public void all_options_should_be_checked() {

    }
    @When("user clicks on the deselect button")
    public void user_clicks_on_the_deselect_button() {

    }
    @Then("all options should be unchecked")
    public void all_options_should_be_unchecked() {

    }


}
