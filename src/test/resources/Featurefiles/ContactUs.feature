Feature: Contact Us Feature

  @Contactus
  Scenario Outline: Contact Us scenario with different set of data
    Given user navigates to contact us page
    When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on send button
    Then User verify "Thank you for contacting us. Your message has been submitted and we will be in touch with you as soon as possible." text in the msg field
    Examples:
      | SheetName | RowNumber |
      | TestData  | 0         |
      | TestData  | 1         |
      | TestData  | 2         |
      | TestData  | 3         |



