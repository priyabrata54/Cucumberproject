@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-positive
  Scenario: Validate search cars page
    Given I am on the Home page "https://www.carsguide.com.au/" ofCarsGuide Website
    When I move to menu
      | Menu      |
      | buy+sales |
      | reviews   |
    And Click to "Search Cars" of buy secton
    And Select carbrand as "BMW" from Any Make dropdown
    And Select carmodel as "1 Series M" from Any Model dropdown
    And Select location as "NSW - All" from Any Location dropdown
    And Select price as "3000" from Price(max) dropdown
    And click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series M Under 3000 for Sale NSW | CarsGuide"
