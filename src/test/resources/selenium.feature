Feature: Run Selenium Scenarios

  @selenium
  Scenario: Check the title of softpost
    Given I am on the home page of softpost
    Then I should see that title contains tutorials
