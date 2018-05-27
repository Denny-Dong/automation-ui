@KOOP-1697
Feature: 已登录时点击我的头像
  测试是否能进入更换头像

  #头像无法定位，暂无法实现
  @ImageForAndroid @KOOP-1322
  Scenario Outline: 点击我的头像
    头像定位不到  无法实现
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击我的头像按钮
    Then 进入图片页

    Examples: 
      | 用户名         | 密码       |
      | 18969187523 | Creams820|
