@smoke
  Feature: F07_followUs | user opens social links
    Scenario: user opens facebook link
      When user clicks on facebook icon
      Then user navigates to facebook page "https://www.facebook.com/nopCommerce"
    Scenario: user opens twitter link
      When user clicks on twitter icon
      Then user navigates to twitter page "https://twitter.com/nopCommerce"
    Scenario: user opens rss link
      When user clicks on rss icon
      Then user navigates to rss page "https://demo.nopcommerce.com/new-online-store-is-open"
    Scenario: user opens youtube link
      When user clicks on youtube icon
      Then user navigates to youtube page "https://www.youtube.com/user/nopCommerce"