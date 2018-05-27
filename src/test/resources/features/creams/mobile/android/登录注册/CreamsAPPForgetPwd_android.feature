@MAR-4986
Feature: 忘记密码
  I want to use this template for 正常打开忘记密码页


  @CreamsAPPAndroid @MAR-2396   @wangshengwei
  Scenario Outline: 进入忘记密码页
    Given APP进入登录页
    When 点击忘记密码
    Then 进入忘记密码页
    And 页面的字段 "<验证手机>" "<验证邮箱>"显示正确

    Examples:
    |      验证手机     | 验证邮箱     |
    |  通过原手机号验证  | 通过邮箱验证  |