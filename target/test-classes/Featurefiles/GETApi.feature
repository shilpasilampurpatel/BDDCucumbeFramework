Feature:Verify Statuscode in get API
@SMOKETEST
  Scenario Outline: Verify Statuscode in get API
    Given Get call to "<url>"
    Then Response is "<Statuscode>"
    Examples:
      |url|Statuscode|
      |/posts|200|


