@smoke
Feature: F06_homeSliders | user could select home slider and open it
  Scenario: user could select First home slider and open it
    When user click on first home slider iphone
    Then user is redirected to iphone details page

  Scenario:  user could select Second home slider and open it
    When user click on second home slider galaxy
    Then user is redirected to galaxy details page
