#@TesttorunNext
Feature:  Confirm whether a visa is required to visit the UK
#  As a Tourist/StudentI want to know if I require Visa to come to the UK from my country.
#  So that I can make a decision before I travel
#  • Country and Study
#  • Country(A) and Tourism
#  • Country(B) and Tourismhttps://www.gov.uk/check-uk-visa/y
#  @TesttorunNext

  Background:
    Given I am on the UKBA website
 @Next
  Scenario: Japan nationalities coming to study for more than 6 months
    When I choose "Japan" nationality
    And I click on Continue button
    And I select "study" as reason for coming to the UK
    And I click on Continue button
    And I choose option of Longer than 6 months
    And I submit the form
    Then I should be informed that "You’ll need a visa to study in the UK"

#  @TesttorunNext
  Scenario Outline: Nationalities that need Visa coming to UK to study for more than 6 months require Visa with Examples
    When I choose "<CountryName>" nationality
    And I click on Continue button
    And I select "<Reason>" as reason for coming to the UK
    And I click on Continue button
    And I choose option of Longer than 6 months
    And I submit the form
    Then I should be informed that "<Message>"
    Examples:
      | CountryName | Reason | Message                               |
      | Japan       | study  | You’ll need a visa to study in the UK |
      | Morocco       | study  | You’ll need a visa to study in the UK |
      | Ukraine       | study  | You’ll need a visa to study in the UK |

#  @TesttorunNext
  Scenario: Japan nationalities coming to UK for Tourism do not require Visa
    When I choose "Japan" nationality
    And I click on Continue button
    And I select "tourism" as reason for coming to the UK
    And I submit the form
    Then I should be informed that "You will not need a visa to come to the UK"
    And "Your answers" is displayed

#  @TesttorunNext
  Scenario Outline: Nationalities coming to UK for Tourism that do not require Visa
    When I choose "<CountryName>" nationality
    And I click on Continue button
    And I select "<Reason>" as reason for coming to the UK
    And I submit the form
    Then I should be informed that "<Message>"
    And "Your answers" is displayed
    Examples:
      | CountryName | Reason | Message                               |
      | Japan       | tourism  | You will not need a visa to come to the UK|
      | Canada       | tourism  | You will not need a visa to come to the UK|
      | Malaysia       | tourism  | You will not need a visa to come to the UK|

#  @TesttorunNext
  Scenario: Russia nationalities coming to UK for Tourism and not visiting Family will require Visa
    When I choose "Russia" nationality
    And I click on Continue button
    And I select "tourism" as reason for coming to the UK
    And I click on Continue button
    And I choose "no" for visiting partner or family member question
    And I submit the form
    Then I should be informed that "You’ll need a visa to come to the UK"


    ##Task is to create a scenario outline for the last scenario  using the following countries: Russia, Cuba, Belarus