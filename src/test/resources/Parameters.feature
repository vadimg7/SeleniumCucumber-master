Feature: Run Selenium Scenarios

  Scenario: Check the title of website - softpost.
    Given I am on the home page of the "http://www.softpost.org"
    Then I verify that title contains "tutorials"

  Scenario: Check the title of website - Google.
    Given I am on the home page of the "http://www.google.com"
    Then I verify that title contains "Google"






