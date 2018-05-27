@TOAD-413
Feature: 报错反馈

  @TOAD-307
  Scenario: 增加备注
    Given 登录后台
    And 用户进入报错反馈页面
    When 填写备注
    Then 备注保存成功
