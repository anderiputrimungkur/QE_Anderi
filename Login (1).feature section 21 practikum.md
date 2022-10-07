Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  Scenario: Login with valid username and valid password
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click Login button
    Then I will go to dashboard

  Scenario: Login with ivalid username and valid password
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And I click Login button
    Then I will get error message

  Scenario: Login with valid username and ivalid password
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Login with ivalid username and ivalid password
    Given I am on the login page
    When I input invalid username
    And I input invalid password
    And I click Login button
    Then I will get error message

  Scenario: Login with valid username
    Given I am on the login page
    When I input valid username
    And I click Login button
    Then I get warning error

  Scenario: Login with valid password
    Given I am on the login page
    When I input valid password
    And I click Login button
    Then I get warning error

  Scenario: Login with ivalid username
    Given I am on the login page
    When I input invalid username
    And I click Login button
    Then I get warning error

  Scenario: Login with ivalid password
    Given I am on the login page
    When I input invalid password
    And I click Login button
    Then I get warning error