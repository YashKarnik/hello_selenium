Feature: Get title of youtube video

  Scenario: Get title of youtube video
    Given I am logged into youtube
    When User searches for video
    And Clicks on first video
    Then User should have video title