@MAR-4986
Feature: 统计分析
  I want to use this template for 统计分析

  @CreamsAPPAndroid @pengxingyue
  Scenario Outline: 统计分析界面
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击导航进入导航页面
    And 点击统计分析
    Then 进入统计分析界面

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|