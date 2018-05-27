@tag
Feature: 验证匹配房源的楼盘数是否正确
  I want to use this template for 在我的需求列表中查看匹配房源

  @CreamsIOSTesting @KOOP-1056
  Scenario Outline: 验证匹配房源的楼盘数是否正确
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 选择区域 "<区域>" 和面积区间 "<面积区间>" 和租金区间 "<租金区间>" 和装修 "<装修>" 和输入需求描述 "<需求描述>" 和输入佣金分成 "<佣金分成>"新建需求成功
    When 点击我tab进入我的主页
    And 点击我的需求按钮进入我的需求页
    And 点击查看匹配房源按钮
    Then 匹配楼盘共 "<几>"个

    Examples: 
      | 用户名         | 密码       | 区域  | 面积区间    | 租金区间 | 装修 | 需求描述             | 佣金分成 | 几 |
      | 18969187523 | Creams820 | 余杭区 | 100-200 | 1-2  | 简装 | 这价格便宜点Automation | 三七开  | 3 |

