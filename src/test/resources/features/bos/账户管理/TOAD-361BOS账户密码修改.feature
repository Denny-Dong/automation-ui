@TOAD-413
Feature: BOS账户密码修改

  @TOAD-429 
  Scenario Outline: BOS账户密码修改
    Given 登录后台
    And 修改密码 "<oldPasswd>" "<newPasswd>"
    And 登出后台
    Then 用新密码登录后台 "<newPasswd>"
    And 修改密码 "<newPasswd>" "<oldPasswd>"

    Examples: 
      | oldPasswd | newPasswd |
      | Whalefin403Souban701 | Test820   |
