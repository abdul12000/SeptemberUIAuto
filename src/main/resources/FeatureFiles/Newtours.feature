Feature: Newtours website
@Newtours
  Scenario Outline: Register by entering only User Information
    Given I am on the Newtours website
    When I click on the Register link
    And I enter "<Username>", password and confirm as "<Password>"
    And enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"
    Examples:
      | Username | Password    | CountryName |
      | Jose | password120 | ANGOLA      |