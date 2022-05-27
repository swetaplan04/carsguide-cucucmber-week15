@cardealer
Feature: Search functionality

  Scenario: Search the dealer name
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Find a Dealer’ link
    Then I see the dealer lists
      | 3 Point Motors Epping       |
      | 4WD Specialist Group        |
      | 5 Star Auto Trade           |
      | A&S Autos Pty Ltd           |
      | A1 Motors Company Glenorchy |
      | Amac Motor Group            |