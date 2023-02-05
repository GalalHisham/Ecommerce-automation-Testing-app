@smoke
Feature: F03_Currencies | User could switch between dollar and euro
  Scenario: user could switch currencies
    When user chooses from currency droplist and chooses euro
    Then Verify Euro Symbol (€) is shown on the four products displayed in Home page