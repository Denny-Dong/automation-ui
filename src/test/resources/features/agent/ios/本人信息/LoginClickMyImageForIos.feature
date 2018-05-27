@KOOP-1689
Feature: 已登录时点击我的头像
  测试是否能进入更换头像
  
#新版本废弃
  @loginImageForIos @KOOP-1322
  Scenario Outline: 点击我的头像
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击头像按钮
    Then 进入更换头像页

    Examples: 
      | 用户名         | 密码       |
      | 18969187523 | Creams820 |
