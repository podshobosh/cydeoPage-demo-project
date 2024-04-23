package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class WT_OrderPageStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    OrderPage orderPage = new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();


    @Given("user is already logged on to the Web Tables App")
    public void user_is_already_logged_on_to_the_web_tables_app() {
        loginPage.login();
    }
    @When("user is on the Oder page")
    public void user_is_on_the_oder_page() {
        orderLink.click();
    }
    @When("user selects one of the below options under product dropdown")
    public void user_selects_one_of_the_below_options_under_product_dropdown(List<String> options) {
       for (String option : options) {
           BrowserUtils.selectOptionFromDropdown(Driver.getDriver(), orderPage.productDropdown, option);
       }
    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String expectedQuantity) {
        orderPage.quantityInput.sendKeys(Keys.BACK_SPACE + expectedQuantity);
    }
    @Then("user clicks to calculate button")
    public void user_clicks_to_calculate_button() {
        orderPage.calcBttn.click();
    }
    @Then("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        orderPage.nameInput.sendKeys(name);
    }
    @Then("user enters enters street {string}")
    public void user_enters_enters_street(String streetAddress) {
        orderPage.streetAddressInput.sendKeys(streetAddress);
    }
    @Then("user enters city {string}")
    public void user_enters_city(String city) {
        orderPage.cityInput.sendKeys(city);
    }
    @Then("user enters state {string}")
    public void user_enters_state(String stateName) {
        orderPage.stateInput.sendKeys(stateName);
    }
    @Then("user enters zip {string}")
    public void user_enters_zip(String zip) {
        orderPage.zipInput.sendKeys(zip);
    }
    @Then("user selects payment option {string}")
    public void user_selects_payment_option(String cardType) {
        BrowserUtils.clickRadioButton(orderPage.radioButtons, cardType);
    }
    @Then("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNum) {
        orderPage.cardNumInput.sendKeys(cardNum);
    }
    @Then("user enters expiration date {string}")
    public void user_enters_expiration_date(String expirationDate) {
        orderPage.cardExpInput.sendKeys(expirationDate);
    }
    @Then("user clicks to process order button")
    public void user_clicks_to_process_order_button() {
        orderPage.processOrderBttn.click();
    }
    @Then("user should see {string} in the first row of the web table")
    public void user_should_see_in_the_first_row_of_the_web_table(String expectedName) {

        String actualName = viewAllOrdersPage.orderName.getText();
        System.out.println(actualName);
        Assert.assertEquals(actualName, expectedName);
    }

}
