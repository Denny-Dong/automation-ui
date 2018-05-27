@TOAD-413
Feature: 添加人员
            As a 主管
            I want to 为所在部门或子部门添加              人员
            So that 部门人员增加

  Background: 
    Given 登录后台
    And 用户在账户管理
    Then 后台数据清理成员
      | department  | member |
      | automation2 | 测试人员吴1 |
      | automation2 | 测试人员吴2 |
    And 后台数据清理部门
      | department  |
      | automation2 |

  @TOAD-153 @AcceptenceTestBOS
  Scenario Outline: 添加人员已存在
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    And 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    When 添加成员 "<department>" "<name2>" "<mail>" "<phone2>"
    Then 提示已存在相同邮箱
    And 删除成员 "<department>" "<name>"
    And 删除部门 "<department>"

    Examples: 
      | department  | name   | mail                  | phone     | name2  | phone2    |
      | automation2 | 测试人员吴1 | 12345678@91souban.com | 123412332 | 测试人员吴2 | 123441234 |

  @TOAD-157 @AcceptenceTestBOS
  Scenario Outline: 保存成员
    Given 登录后台
    And 用户在账户管理
    And 进入总部门
    And 添加子部门 "<department>"
    When 添加成员 "<department>" "<name>" "<mail>" "<phone>"
    Then 验证成员存在 "<name>"
    And 删除成员 "<department>" "<name>"
    And 删除部门 "<department>"

    Examples: 
      | department  | name   | mail                    | phone     |
      | automation2 | 测试人员吴2 | 1234356789@91souban.com | 123412332 |
