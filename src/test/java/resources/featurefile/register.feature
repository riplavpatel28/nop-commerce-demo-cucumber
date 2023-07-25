Feature: Register Test
  As a user i want to register in nop commerce website

  @sanity
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on homepage
    When I click on Register link
    Then I should see Verify that the "Register"

  @sanity
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on homepage
    When I click on Register link
    And I click On RegisterButton
    And I should  Verify error message "First name is required."
    And I Should  Verify  LastName error message "Last name is required."
    And I Should see  Verify Email error message "Email is required."
    And I should see Verify  Password error message "Password is required."
    And  I should see Verify confirmPassword error message "Password is required."

  @Regression
  Scenario: VerifyThatUserShouldCreateAccountSuccessfully
    Given I am on homepage
    When I click on Register link
    And I  Select gender "Female"
    And I  Enter firstname
    And I Enter lastname
    And I   Select day
    And I Select month
    And I  Select year
    And I  Enter email
    And I   Enter password
    And I  Enter Confirm Password
    And I  Click  REGISTER button
    Then I  Verify message "Your registration completed"






