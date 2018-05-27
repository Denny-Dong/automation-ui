@KOOP-1689
Feature: 退出登录
  I want to use this template for 退出登录
    
 @CreamsIOSTesting @KOOP-1132
 Scenario Outline: 退出登录
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击退出登录按钮
    And 点击是否确认退出页的确认按钮
    Then 退出账号成功

    Examples: 
      | 用户名       | 密码   |
      | 18158885555 | 111111|
      
 @CreamsIOSTesting @KOOP-1132
 Scenario Outline: 取消退出
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击退出登录按钮
    And 点击是否确认退出页的取消按钮
    Then 退出账号失败

    Examples: 
      | 用户名       | 密码   |
      | 18158885555 | 111111|
