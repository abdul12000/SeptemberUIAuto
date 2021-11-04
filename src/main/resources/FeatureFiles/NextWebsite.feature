Feature: Hover unto a main menu and select a submenu to get to the menu page
  As a user of the Next website
  I want to be able to navigate to a specific page
  So that I can see only items i want on the page
@Next
  Scenario: Navigate to Home furnishings Page
    Given I am on the Next Landing page
    When I navigate to the Home Furnishings Link
    Then the Home furnishings page should be displayed


