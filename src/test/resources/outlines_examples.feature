Feature: Run Selenium Scenarios

  Scenario Outline: Check the title of website.
    Given I am on the home page of the <website>
    Then I verify that title contains <word>

    Examples: This is a test data
      |website                |word     |
      |http://www.softpost.org|tutorials|
      |http://www.google.com  |Google   |



