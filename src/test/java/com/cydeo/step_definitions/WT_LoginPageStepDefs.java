package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WT_LoginPageStepDefs
{
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters the credentials below")
    public void user_enters_the_credentials_below(Map<String, String> credentials) {

        loginPage.username.sendKeys(credentials.get("username"));
        loginPage.password.sendKeys(credentials.get("password"));

    }

    @When("clicks login button")
    public void clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should see {string} in the URL")
    public void userShouldSeeInTheURL(String expectedURL) {
        BrowserUtils.verifiyURL(expectedURL);
    }



    @When("user enters invalid username {string} and invalid password {string}")
    public void userEntersInvalidUsernameAndInvalidPassword(String user, String password) {
        loginPage.username.sendKeys(user);
        loginPage.password.sendKeys(password);
    }

    @Then("user should see an error message indicating invalid credentials")
    public void userShouldSeeAnErrorMessageIndicatingInvalidCredentials() {

        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }
}
