@regression
Feature: Search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>" on new and used card search
    And I select model "<model>" on new and used card search
    And I select location "<location>" on new and used card search
    And I select price "<price>" on new and used card search
    And I click on Find My Next Car tab on new and used card search
    Then I should see the make "<make>" in results
    Examples:
      | make | model   | location  | price   |
      | Jeep | Compass | QLD - All | $20,000 |
      | Kia  | Rio     | VIC - All | $15,000 |
      | Audi | A3      | NSW - All | $10,000 |
      | BMW    | 118d    | VIC - All | $25,000 |
      | Nissan | Cube    | WA - All  | $30,000 |
      | Mazda  | CX-5    | NSW - All | $15,000 |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>" on used card search
    And I select model "<model>" on used card search
    And I select location "<location>" on used card search
    And I select price "<price>" on used card search
    And I click on Find My Next Car tab on used card search
    Then I should see the make "<make>" in results
    Examples:
      | make   | model   | location  | price   |
      | Jeep   | Compass | QLD - All | $20,000 |
      | Kia    | Rio     | VIC - All | $15,000 |
      | Audi   | A3      | NSW - All | $10,000 |
      | BMW    | 118d    | VIC - All | $25,000 |
      | Nissan | Cube    | WA - All  | $30,000 |
      | Mazda  | CX-5    | NSW - All | $15,000 |