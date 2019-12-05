Feature: Run Selenium Scenarios

  Scenario Outline: Check that you can enter firstName and lastName.
    Given I am on the url "http://www.softpost.org/selenium-test-page"
    Then I verify that I can enter first name as <firstName>
    Then I verify that I can enter last name as <lastName>

    Examples: This is a test data
      |firstName              | lastName     |
      |shaun                  | loh          |
      |tim1                    | wilson       |



