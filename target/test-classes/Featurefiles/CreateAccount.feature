Feature: CreateAccount Feature

  @CreateAccount
  Scenario Outline: Create account scenario with different set of data
    Given user navigates to CreateAccountPage
    When user fills the CreateAccount from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on CreateAccount button
    Then User verify "Thank you for creating your account at Kapiva. Your account details have been emailed to " in the successfully msg field
    Examples:
      | SheetName | RowNumber |
      | TestData1 | 0         |
      | TestData1 | 1         |
      | TestData1 | 2         |
      | TestData1 | 3         |


