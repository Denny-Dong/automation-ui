@KOOP-1689
Feature: 楼盘入驻申请
  I want to 提交楼盘入驻申请

  @CreamsIOSTesting @KOOP-2017
  Scenario Outline: 用户登录，提交楼盘入驻申请
    Given 用户 "<用户名>" "<密码>" 已登录
    When 点击楼宇入驻申请进入申请页面
    And 填写申请信息 "<城市>" "<区域>" "<大楼名称>" "<联系人>" "<联系方式>"
    And 点击提交
    Then 楼宇入驻申请提交成功

    Examples: 
      | 用户名         | 密码       | 城市  | 区域  | 大楼名称      | 联系人     | 联系方式        |
      | 18969187523 | Creams820 | 杭州市 | 江干区 | auto测试大楼6 | auto测试6 | 18000000006 |
