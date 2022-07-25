Feature: Checkout feature
  @Checkout
  Scenario Outline: checkout feature with guest user Emails
    Given when user navigates to checkout page
    And click on go back to shop button
    And Click on Buynowbutton to navigate to checkoutPage
    When user fills Checkout form from the given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User click on Pay button
    Then User navigate to payment section
    Examples:
      |SheetName|RowNumber|
      |TestData2|0|
      |TestData2|1|
      |TestData2|2|
      |TestData2|3|