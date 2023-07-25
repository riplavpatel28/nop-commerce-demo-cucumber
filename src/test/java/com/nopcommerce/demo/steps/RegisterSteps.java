package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see Verify that the {string}")
    public void iShouldSeeVerifyThatThe(String registerText) {
        new HomePage().verifyRegisterText(registerText);

    }

    @And("I click On RegisterButton")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should  Verify error message {string}")
    public void iShouldVerifyErrorMessage(String firstname) {
        Assert.assertEquals("text not verify",firstname,new RegisterPage().verifyFirstNameError());
    }

    @And("I Should  Verify  LastName error message {string}")
    public void iShouldVerifyLastNameErrorMessage(String LastName) {
        Assert.assertEquals("text not verify",LastName,new RegisterPage().verifyLastNameError());
    }

    @And("I Should see  Verify Email error message {string}")
    public void iShouldSeeVerifyEmailErrorMessage(String email) {
        Assert.assertEquals("Text not verify",email,new RegisterPage().verifyEmailIdError());
    }

    @And("I should see Verify  Password error message {string}")
    public void iShouldSeeVerifyPasswordErrorMessage(String password) {
        Assert.assertEquals("Text not verify",password,new RegisterPage().verifyPasswordError());
    }

    @And("I should see Verify confirmPassword error message {string}")
    public void iShouldSeeVerifyConfirmPasswordErrorMessage(String ConfirmPassword) {
        Assert.assertEquals("Text not verify",ConfirmPassword,new RegisterPage().verifyConfirmPasswordError());
    }

    @And("I  Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectFemaleRadio();
    }

    @And("I  Enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Rupal");
    }

    @And("I Enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("Patel");
    }

    @And("I   Select day")
    public void iSelectDay() {
        new RegisterPage().selectDateOfBirthDay("9");
    }

    @And("I Select month")
    public void iSelectMonth() {
        new RegisterPage().selectDateOfBirthMonth("August");
    }

    @And("I  Select year")
    public void iSelectYear() {
        new RegisterPage().selectDateOfBirthYear("1978");
    }

    @And("I  Enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmailId("riplav@yahoo.com");
    }

    @And("I   Enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("Shivam18");
    }

    @And("I  Enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Shivam18");
    }
    @And("I  Click  REGISTER button")
    public void iClickREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @Then("I  Verify message {string}")
    public void iVerifyMessage(String msg) {
        Assert.assertEquals("Your registration completed",msg,new RegisterPage().verifyRegistrationMsg());
    }


}
