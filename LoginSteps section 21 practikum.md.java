package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("testqa");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Demoq@123");
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputInvalidUsername("ahha");
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputInvalidPassword("ahha");
    }

    @Then("I get warning error")
    public void iGetWarningError() {
        loginPage.warningErrorDisplayed();
    }
}
