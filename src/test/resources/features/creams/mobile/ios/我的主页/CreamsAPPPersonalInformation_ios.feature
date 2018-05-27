@MAR-4984
Feature: 个人信息
  I want to use this template for 个人信息

  @CreamsAPPIOS @MAR-4319   @wangshengwei
  Scenario Outline: 修改姓名
  #修改姓名
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击个人信息进入个人信息页
    And 点击姓名显示框进入修改姓名页
    And 输入姓名为 "<新姓名>"
    And 点击修改姓名页的保存
    Then 姓名输入框中的姓名改为 "<新姓名>"，姓名修改成功
  #重置姓名
    When 点击姓名显示框进入修改姓名页
    And 输入姓名为 "<姓名>"
    And 点击修改姓名页的保存
    Then 姓名输入框中的姓名改为 "<姓名>"，姓名修改成功

    Examples: 
      |          邮箱        |    密码    | 新姓名  | 姓名   |
      | swwang@91souban.com | Creams820  | silence | stone |
      
      
  @CreamsAPPIOS  @MAR-4320
  Scenario Outline: 修改微信号
  #修改微信号
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击个人信息进入个人信息页
    And 点击微信号显示框进入修改微信号页
    And 输入微信号为 "<新微信号>"
    And 点击修改微信号页的保存
    Then 微信号输入框中的微信号改为 "<新微信号>"，微信号修改成功
  #重置微信号
    When 点击微信号显示框进入修改微信号页
    And 输入微信号为 "<微信号>"
    And 点击修改微信号页的保存
    Then 微信号输入框中的微信号改为 "<微信号>"，微信号修改成功

    Examples: 
      |         邮箱          |     密码    |  新微信号 |   微信号  |
      |  swwang@91souban.com  | Creams820   |  stone  |  silence |


  @CreamsAPPIOS @MAR-4320   @wangshengwei
  Scenario Outline: 修改手机号
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击个人信息进入个人信息页
    And 点击手机号显示框
    Then 进入验证原号码页

    Examples:
      |         邮箱          |     密码    |
      |  swwang@91souban.com  | Creams820  |
