Feature: LogIn Test

  As a User i want to login into nop commerce website

  @smoke
  Scenario:  User should navigate to login page successfully
    Given  I am on homepage
    When  I click on login link
    Then  I should navigate to login page successfully
  @smoke
  Scenario Outline: verifyTheErrorMessageWithInValidCredentials
    Given  I am on HomePage
    When  I click on login link
    And  I enter email"<email>"
    And  I enter password"<password>"
    And  I Click on Login Button
    Then I should see  Verify that the "<errorMessage>"

    Examples:
      | email            | password | errorMessage                                                                                |
      | xxyy1@gmail.com  | zz11     | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | abc123@gmail.com | 2233     | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | home11@gmail.com | 1111     | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |


    @smoke
    Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials
      Given I am on HomePage
      When  I click on login link
      And   I enter email"riplav@yahoo.com"
      And   I enter password"Shivam18"
      And   I Click on Login Button
      Then  Verify that LogOut link is display


      @smoke
      Scenario: VerifyThatUserShouldLogOutSuccessFully
       Given  I am on HomePage
        When  I click on login link
        And   I enter email"riplav@Yahoo.com"
        And   I enter password"Shivam18"
        And   I Click on Login Button
        And I  Click on LogOut Link
        Then Verify that LogIn Link Display



