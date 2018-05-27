@MAR-4986
Feature: 招商分析
  I want to use this template for 测试点击招商分析是否发生APPß崩溃

  @CreamsAPPIOS   @wangshengwei
  Scenario Outline: 点击招商分析进入招商分析页
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击导航进入导航页
    And 点击招商分析
    Then 成功进入招商分析页


    Examples:
      | 邮箱                | 密码     |
      | xypeng@91souban.com |Pexy6666 |