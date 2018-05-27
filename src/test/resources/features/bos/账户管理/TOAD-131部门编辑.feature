@TOAD-413
Feature: 部门编辑或删除
          As a 主管
          I want to 编辑子部门或删除子部门
          So that 更改部门名或删除滋补

  Background: 
    Given 登录后台
    And 用户在账户管理
    Then 后台数据清理成员
      | department | member |
      | 测试一部门     | 测试人员吴  |
    And 后台数据清理部门
      | department |
      | 测试一部门      |
      | 测试二部门      |

  @TOAD-148 @AcceptenceTestBOS
  Scenario Outline: 部门编辑保存成功
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    When 修改部门 "<department>" 名字 "<newDepartment>"
    Then 验证部门存在 "<newDepartment>"
    And 删除部门 "<newDepartment>"

    Examples: 
      | department | newDepartment |
      | 测试一部门       | 测试二部门           |

  @TOAD-149 @AcceptenceTestBOS
  Scenario Outline: 部门编辑保存失败
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<firstDepartment>"
    And 添加子部门 "<secondDepartment>"
    When 修改部门 "<secondDepartment>" 名字 "<firstDepartment>"
    Then 提示部门名称重复
    And 删除部门 "<firstDepartment>"
    And 删除部门 "<secondDepartment>"

    Examples: 
      | firstDepartment | secondDepartment |
      | 测试一部门           | 测试二部门            |

  @TOAD-150 @AcceptenceTestBOS
  Scenario Outline: 存在成员删除部门
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    And 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    And 验证成员存在 "<name>"
    When 删除部门 "<department>"
    Then 提示部门下存在业务员或有下级部门
    And 删除成员 "<department>" "<name>"
    And 删除部门 "<department>"

    Examples: 
      | department | name  | mail           | phone     |
      | 测试一部门      | 测试人员吴 | 1234567@91souban.com | 123412332 |

  @TOAD-151 @AcceptenceTestBOS
  Scenario Outline: 删除部门
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    When 添加子部门 "<department>"
    And 删除部门 "<department>"

    Examples: 
      | department |
      | 测试一部门      |
