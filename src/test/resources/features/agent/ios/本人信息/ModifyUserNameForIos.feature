@KOOP-1689
Feature: 个人信息可以修改姓名
  测试下在个人信息页修改姓名

  @CreamsIOSTesting @KOOP-1397
  Scenario Outline: 修改姓名
  
  #修改姓名
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击个人信息
    And 修改姓名为 "<新姓名>"
    And 点击个人信息页的保存修改按钮
    Then 个人信息栏姓名变为 "<新姓名>"，姓名修改成功
    
  #重置姓名
    When 点击个人信息
    And 修改姓名为 "<姓名>"
    And 点击个人信息页的保存修改按钮
    Then 个人信息栏姓名变为 "<姓名>"，姓名修改成功

    Examples: 
      |    用户名    |    密码   |  新姓名  |    姓名    |
      | 18158885555 | 111111 | 张三 |silence|