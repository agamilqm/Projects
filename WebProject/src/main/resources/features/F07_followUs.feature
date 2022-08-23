@smoke
Feature: F08_followUs | user opens FB,Twitter,rss,youtube
  Scenario: User opens FaceBook link
    Given user opens facebook link
    Then "https://www.facebook.com/nopCommerce" FB is opened in new tab


  Scenario:user opens twitter link
    Given user opens twitter link
    Then "https://twitter.com/nopCommerce" Tw is opened in new tab



  Scenario:user opens youtube link
    Given user opens youtube link
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab

