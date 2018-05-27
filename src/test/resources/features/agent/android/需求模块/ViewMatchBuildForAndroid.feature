@tag
Feature: 新建需求后查看匹配房源
   I want to use this template for 新建需求后查看匹配房源

  @matchBuild @KOOP-1054
  Scenario Outline: 新建需求后查看匹配房源
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    And 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>" 
    And 填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    When 点击立即查看按钮
    Then 匹配楼盘共有 "<几>"个，数量相符

    Examples: 
      | 用户名         | 密码       | 区域  | 面积区间    | 租金区间 | 装修 | 需求描述             | 佣金分成 | 几 |
      | 18969187523 | Creams820| 余杭区 | 100-200 | 1-2  | 简装 | 这价格便宜点Automation | 三七开  | 3 |
