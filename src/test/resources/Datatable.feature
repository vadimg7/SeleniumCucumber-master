Feature: Run Selenium Scenarios

  Scenario: Check the title of website - softpost.
    Given I verify the website title as mentioned below
          | website | http://www.softpost.org |
          | title   | tutorial                |
          | user   | xyz                |

  Scenario: Check the title of website - google.
    Given I verify the website title as mentioned below
      | website | http://www.google.com   |
      | title   | Google                  |






