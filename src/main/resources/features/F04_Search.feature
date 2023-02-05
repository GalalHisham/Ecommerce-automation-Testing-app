@smoke
  Feature: F04_Search | user could search for product
    Scenario Outline: user could search using product name
      When user presses on search field
      And user enters name "<product name>" and user press on search button
      Then user will find all related products "<product name>"
      Examples:
      | product name |
      | book |
      | laptop |
      | nike |

    Scenario Outline: user could search using product SKU
      When  user presses on search field
      And user enters SKU "<product SKU>" and user presses on search button
      Then user will find related products "<product SKU>"
      Examples:
      | product SKU |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |