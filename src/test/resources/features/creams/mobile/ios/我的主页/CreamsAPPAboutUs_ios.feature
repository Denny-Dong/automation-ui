@MAR-4986
Feature: 关于我们
  I want to use this template for 测试点击关于我们是否发生APP崩溃

  @CreamsAPPIOS   @wangshengwei
  Scenario Outline: 点击招商分析进入招商分析页
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    And 点击关于我们
    Then 成功进入关于我们页


    Examples:
      | 邮箱                | 密码     |
      | xypeng@91souban.com |Pexy6666 |