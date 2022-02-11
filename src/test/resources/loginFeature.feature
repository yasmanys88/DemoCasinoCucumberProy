Feature: Securely log into the system
  Verify that the new user registration is successful.

  Background:
    Given the user open "Chrome" browser
    When the user navigates to "demo.casino"
    Then the user should be in home page

  Scenario: Registration by email
    Given the user on the user registration page
    When the user enter select registration by email and enter all the required details
      | Fields   | Values                   |
      | email    | automationtest@gmail.com |
      | currency | EUR                      |
      | password | PwX8EMTbnbshxfQ          |
    Then the user registration should be successful.

  Scenario: Registration by phone
    Given the user on the user registration page
    When the user enter select registration by phone and enter all the required details
      | Fields   | Values          |
      | phone    | 59893453401     |
      | currency | EUR             |
      | password | PwX8EMTbnbshxfQ |
    Then the user registration should be successful.

  Scenario Outline: Access to site with valid credentials
    Given the user on the user sign in page
    When the user enter her <credential> and <password>
    Then the user login should be successful.
    Examples:
      | credential               | password        |
      | 59893453401              | PwX8EMTbnbshxfQ |
      | automationtest@gmail.com | PwX8EMTbnbshxfQ |
      | usuariologin             | PwX8EMTbnbshxfQ |