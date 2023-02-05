@smoke
  Feature: F05_hoverCategories | user could select different categories
    Scenario: user could select different categories then hover on them and select sub category
      When user hovers on random category
      And user selects random subcategory
      Then subcategory page appears