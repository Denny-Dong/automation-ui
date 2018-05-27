@MAR-4986
Feature: 合同审核
  I want to use this template for 合同审核

  @pexy @pengxingyue
  Scenario Outline: 合同审核页列表检查
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击合同审核
    Then 进入合同审核页面
    And 我发起的列表信息显示正确

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|

  @pexy @pengxingyue
  Scenario Outline: 最新消息点击进入账单详情
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击最新消息
    And 点击第一条提醒
    Then 进入账单详情页面

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com | Pexy6666|

  @pexy @pengxingyue
  Scenario Outline: 最新消息点击进入合同详情
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页面
    And 点击最新消息
    And 点击租期提醒tab
    And 点击第一条提醒
    Then 进入合同详情页面

    Examples:
      |          邮箱        |   密码   |
      | xypeng@91souban.com  | Pexy6666|