package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().ClickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }


    @And("I enter email{string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password{string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see  Verify that the {string}")
    public void iShouldSeeVerifyThatThe(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage,"Error message not displayed");
    }


    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }


    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
        new HomePage().LogoutLinkDisplayed();
    }

    @And("I  Click on LogOut Link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        new HomePage().LogInLinkDisplayed();
    }
}
