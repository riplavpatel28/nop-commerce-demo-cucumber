package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);}

        @FindBy(id = "register-button")
        WebElement registrationButton;

         @FindBy(id = "FirstName-error")
         WebElement firstNameError;

         @FindBy(id = "LastName-error")
         WebElement lastNameError;

         @FindBy(id = "Email-error")
         WebElement emailError;

         @FindBy(id = "Password-error")
         WebElement passwordError;

         @FindBy(id ="ConfirmPassword-error")
         WebElement ConfirmPasswordError;

          @FindBy(id = "gender-female")
          WebElement femaleRadioButton;

          @FindBy(id = "FirstName")
          WebElement firstname;

        @FindBy(id = "LastName")
        WebElement Lastname;

        @FindBy(xpath = "//select[@name='DateOfBirthDay']")
        WebElement day;

        @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
        WebElement month;

        @FindBy(xpath = "//select[@name='DateOfBirthYear']")
        WebElement year;
        @FindBy(id = "Email")
        WebElement email;

        @FindBy(id = "ConfirmPassword")
        WebElement confirmPassword;
        @FindBy(id = "Password")
        WebElement password;
         @FindBy(xpath = "//div[@class='result']")
         WebElement registrationMsg;


    public void clickOnRegisterButton(){
        clickOnElement(registrationButton);
    }
    public String verifyFirstNameError() {
        return getTextFromElement(firstNameError);
    }
    public String verifyLastNameError() {
        return getTextFromElement(lastNameError);
    }

    public String verifyEmailIdError() {
        return getTextFromElement(emailError);
    }

    public String verifyPasswordError() {
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        return getTextFromElement(ConfirmPasswordError);
    }
    public void selectFemaleRadio(){
        clickOnElement(femaleRadioButton);
    }
    public void enterFirstName(String Name){
        sendTextToElement(firstname,Name);
    }
    public void enterLastName(String lastName){
        sendTextToElement(Lastname,lastName);
    }

    public void selectDateOfBirthDay(String value){
        selectByValueFromDropDown(day,"9");
    }
    public void selectDateOfBirthMonth(String Text){
        selectByVisibleTextFromDropDown(month,"August");
    }
    public void selectDateOfBirthYear(String Text){
        selectByVisibleTextFromDropDown(year,"1978");
    }

    public void enterEmailId(String Email){
        sendTextToElement(email,Email);
    }
    public void enterPassword(String Password){
        sendTextToElement(password,Password);
    }
    public void enterConfirmPassword(String ConfirmPassword){
        sendTextToElement(confirmPassword,ConfirmPassword);
    }
    public String verifyRegistrationMsg(){
        return getTextFromElement(registrationMsg);
    }


    }

