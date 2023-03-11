Feature: HRMS_login

  Scenario: Log in functionality validation
    Given User lauches browser
    And User enters url "http://183.82.103.245/nareshit/login.php"
    When User enters "nareshit" and "nareshit"
    Then User clicks on login button