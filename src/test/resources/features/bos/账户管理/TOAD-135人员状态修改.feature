@TOAD-413
Feature: 查看或修改人员信息
     As a 主管
     I want to 更改人员信息
     So that 可以修改人员信息和部门所属及角色

  Background: 
    Given 登录后台
    And 用户在账户管理
    Then 后台数据清理成员
      | department  | member |
      | automation3 | 测试人员金  |
      | automation3 | 测试人员哈哈 |
    And 后台数据清理部门
      | department  |
      | automation3 |

  @TOAD-164 @AcceptenceTestBOS
  Scenario Outline: 删除成员
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    When 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    Then 验证成员存在 "<name>"
    And 删除成员 "<department>" "<name>"
    And 删除部门 "<department>"

    Examples: 
      | department  | name  | mail                   | phone     |
      | automation3 | 测试人员金 | 123455544@91souban.com | 123412332 |

  @TOAD-366 @AcceptenceTestBOS
  Scenario Outline: 修改成员信息
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    And 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    When 修改成员姓名 "<department>" "<name>" "<name2>"
    Then 验证成员存在 "<name2>"
    And 删除成员 "<department>" "<name2>"
    And 删除部门 "<department>"

    Examples: 
      | department  | name  | mail                    | phone     | name2  |
      | automation3 | 测试人员金 | 1442345544@91souban.com | 123412332 | 测试人员哈哈 |

  @TOAD-817 @AcceptenceTestBOS
  Scenario Outline: 人员详情编辑电话修改
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    And 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    When 修改成员电话 "<department>" "<name>" "<phone>" "<phone2>"
    Then 验证电话修改成功 "<phone2>"
    And 删除成员 "<department>" "<name>"
    And 删除部门 "<department>"

    Examples: 
      | department  | name  | mail                    | phone     | phone2        |
      | automation3 | 测试人员金 | 1423446866@91souban.com | 123412332 | 1362349777325 |
