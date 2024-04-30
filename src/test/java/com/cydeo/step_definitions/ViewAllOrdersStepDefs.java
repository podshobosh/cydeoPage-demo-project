package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ViewAllOrdersStepDefs extends BasePage {

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @And("user is on the View all Orders page")
    public void user_is_on_the_view_all_orders_page() {

        viewAllOrdersLink.click();

    }
    @When("user clicks the select All button")
    public void user_clicks_the_select_All_button() {

        viewAllOrdersPage.selectAllBttn.click();

    }
    @Then("all options should be checked")
    public void all_options_should_be_checked() {

        BrowserUtils.areAllCheckboxesSelected(Driver.getDriver(), viewAllOrdersPage.allCheckboxes);

    }
    @When("user clicks on the deselect button")
    public void user_clicks_on_the_deselect_button() {
        viewAllOrdersPage.deselectAllBttn.click();
        BrowserUtils.sleep(2);
    }
    @Then("all options should be unchecked")
    public void all_options_should_be_unchecked() {

        for (WebElement each : viewAllOrdersPage.allCheckboxes) {
            Assert.assertFalse(each.isSelected());
        }
    }


}
