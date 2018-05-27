@MAR-4984
Feature: 我的主页
  I want to use this template for 我的主页的相关功能

  @CreamsAPPIOS  @MAR-2432  @wangshengwei
  Scenario Outline: 修改密码
  #修改密码
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击修改密码
    And 填写原密码 "<密码>"
    And 填写新密码 "<新密码>"
    And 填写确认新密码 "<新密码>"
    And 点击修改密码页的完成
    And 点击设置按钮进入设置页
    And 点击退出登录
    And 点击确认退出
    Then 使用原邮箱 "<邮箱>"和新密码 "<新密码>"登录
    And 登录成功后，密码修改成功
    
  #重置密码
    When 点击我进入我的主页
    And 点击修改密码
    And 填写原密码 "<新密码>"
    And 填写新密码 "<密码>"
    And 填写确认新密码 "<密码>"
    And 点击修改密码页的完成按钮
    And 点击设置按钮进入设置页
    And 点击退出登录
    And 点击确认退出
    Then 使用原邮箱 "<邮箱>"和新密码 "<密码>"登录
    And 登录成功后，密码重置成功

    Examples: 
      |         邮箱          |    密码   | 新密码      |
      | swwang@91souban.com  | Creams820 | 111111aA   |
      

  @CreamsAPP  @MAR-2432  @wangshengwei
  Scenario Outline: 取消修改密码
  #取消修改密码
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击修改密码
    And 填写原密码 "<密码>"
    And 填写新密码 "<新密码>"
    And 填写确认新密码 "<新密码>"
    And 点击修改密码页的返回
    And 点击设置按钮进入设置页
    And 点击退出登录
    And 点击确认退出
    Then 使用原邮箱 "<邮箱>"和新密码 "<新密码>"登录
    And 登录失败后，密码修改失败
    
   Examples: 
      |         邮箱          |   密码    |    新密码   |
      | swwang@91souban.com  | Creams820 |  111111aA  |
