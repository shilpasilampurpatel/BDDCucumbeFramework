Feature: Login page feature

  @LoginPage
  Scenario: Validate Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Kapiva - Sign in"

  @LoginPage
  Scenario: Validate Forgot Password Link
    Given user is on login page
    Then forgot your password link should be displayed

  @LoginPage
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "shilpa.hk@kapiva.in"
    And user enters password "Kapiva@123"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "Kapiva - Shopping Cart"

  @LoginPage
  Scenario: Login with Incorrect credentials
    Given user is on login page
    When user enters username "shilpa.hk@kapiva.in"
    And user enters password "Kapiva123"
    And user clicks on Login button
    Then User check "Your email address or password is incorrect. Please try again. If you've forgotten your sign in details, just click the 'Forgot your password?' link below." text in the msg field