Feature: Computer Test
  As a user I want to navigate on computerPage.

@smoke
  Scenario:verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When I click On ComputerLink
    Then I should see message "Computers"
@Sanity
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
  Given I am on homepage
  When  I click On ComputerLink
  And   I click on Desktop Link
  Then I should verify "Desktops" Text

  @Regression
  Scenario Outline: :VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When  I click On ComputerLink
    And   I click on Desktop Link
    And  I  Click on product name Build your own computer
    And I  Select processor "<processor>"
    And  I select RAM "<ram>"
    And  I Select HDD "<hdd>"
    And  I Select OS "<os>"
    And  ISelect Software "<software>"
    And I  Click on ADD TO CART Button
    Then I should able to receive verifyMessage "The product has been added to your shopping cart"

Examples:
  | processor                                       | ram           | hdd               | os                      | software                   |
  | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
