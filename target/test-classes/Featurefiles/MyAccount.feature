Feature: Myaccount Page Feature

  Background:
    Given user has already logged in to Kapiva application
      | username            | password |
      | shilpa.hk@kapiva.in | Rose@123 |

  @accounts
  Scenario: Accounts section count
    Given user is on Myccounts page
    When user gets Myaccount section
      | Orders          |
      | Wallet          |
      | Addresses       |
      | Recently Viewed |
      | Account Details |

#And accounts section count should be 6

