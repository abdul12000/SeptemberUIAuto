Feature: Purchasing a flight ticket on BlazeDemo for test
  @Blaze
  Scenario Outline:  Choosing Departure and destination Cities and finding flights for test
    Given I am on the Welcome to Simple Travel Agency landing page
    When I choose the "<departureCity>" and '<destinationCity>' from the drop down
    Then I should be able to see "<departureCity>" and "<destinationCity>" on the BlazeDemo reserve page and 5 flight options
    Examples:
      | departureCity | destinationCity |
      | Boston        | Rome            |
