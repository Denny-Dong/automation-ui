@TOAD-413
Feature: 正式客户列表

  @TOAD-172 @AcceptenceTestBOS
  Scenario: 正式客户列表排序
    Given 登录后台
    And 用户在正式客户列表页面
    When 按最大可管理面积降序排序
    Then 列表按最大可管理面积降序排序

  @TOAD-818 @AcceptenceTestBOS
  Scenario Outline: 客户操作记录
    Given 登录后台
    And 用户在正式客户列表页面
    When 编辑联系人 "<contactPerson>"
    Then 展示操作记录 "<record>"

    Examples: 
      | contactPerson | record       |
      | 测试操作记录        | 修改客户：[联系人姓名] |

  @TOAD-796 @AcceptenceTestBOS
  Scenario: 登录数筛选
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选登录数时间段本月
    Then 筛选条件显示登录时间为本月

  @TOAD-798 @AcceptenceTestBOS
  Scenario: 编辑正式客户的合同编号
    Given 登录后台
    And 用户在正式客户列表页面
    When 编辑合同编号
    Then 保存成功
