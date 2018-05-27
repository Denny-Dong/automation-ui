@TOAD-413
Feature: 添加子部门

  Background: 
    Given 登录后台
    And 用户在账户管理
    Then 后台数据清理部门
      | department  |
      | automation1 |

  @TOAD-144 @AcceptenceTestBOS
  Scenario Outline: 添加子部门
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    And 删除部门 "<department>"

    Examples: 
      | department  |
      | automation1 |

  @TOAD-145 @AcceptenceTestBOS
  Scenario Outline: 添加部门保存
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    When 添加子部门 "<department>"
    Then 验证部门存在 "<department>"
    And 删除部门 "<department>"

    Examples: 
      | department  |
      | automation1 |

  @TOAD-146 @AcceptenceTestBOS
  Scenario Outline: 添加重名部门保存失败
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    When 添加子部门 "<department>"
    And 添加子部门 "<department>"
    Then 提示部门已存在
    And 删除部门 "<department>"

    Examples: 
      | department  |
      | automation1 |
