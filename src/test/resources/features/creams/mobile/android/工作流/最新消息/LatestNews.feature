@MAR-4986
Feature: 最新消息
  I want to use this template for 最新消息

  @CreamsAPPAndroid @pengxingyue
  Scenario Outline: 最新消息页面列表检查
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击最新消息
    Then 进入最新消息页面
    And 页面显示账单提醒和租期提醒列表

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|

  @CreamsAPPAndroid @pengxingyue
  Scenario Outline: 最新消息点击进入账单详情
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击最新消息
    And 点击第一条提醒
    Then 进入账单详情页面

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|

  @CreamsAPPAndroid @pengxingyue
  Scenario Outline: 最新消息点击进入合同详情
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击最新消息
    And 点击租期提醒tab
    And 点击第一条提醒
    Then 进入合同详情页面

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|