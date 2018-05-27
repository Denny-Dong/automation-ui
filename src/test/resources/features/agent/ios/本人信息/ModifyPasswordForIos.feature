@KOOP-1689
Feature: 修改密码与重置密码
  测试修改密码后，重置密码

  @CreamsIOSTesting @KOOP-1210
  Scenario Outline: 修改密码
  
    #修改密码
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击修改密码按钮
    And 输入原密码 "<密码>"
    And 输入新密码 "<新密码>"
    And 输入确认新密码 "<新密码>"
    And 点击修改密码页的完成按钮
    Then 使用原用户名 "<用户名>"和 新密码 "<新密码>"登录成功
    And 修改密码成功
      
    #重置密码
    When 点击修改密码按钮
    And 输入原密码 "<新密码>"
    And 输入新密码 "<密码>"
    And 输入确认新密码 "<密码>"
    And 点击修改密码页的完成按钮
    Then 使用原用户名 "<用户名>"和 新密码 "<密码>"登录成功
    And 重置密码成功

    Examples: 
      | 用户名         | 密码     | 新密码      |
      | 18158885555 | 111111 | aaaaaa |
