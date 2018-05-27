@KOOP-1689
Feature: 登录creamsAgent APP
  I want to use this template for 登录creamsAgent APP

  @CreamsIOSTesting @KOOP-1098
  Scenario Outline: 登录creamsAgent APP
    Given 打开creamsAgent APP成功
    When 点击我tab进入我的主页
    And 点击个人信息
    And 输入我的用户名 "<用户名>" 和我的密码 "<密码>"
    And 点击登录页的登录按钮
    Then 登录成功  

    Examples: 
      | 用户名        | 密码   |
      | 18158885555  | 111111|
