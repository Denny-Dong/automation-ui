@TOAD-413
Feature: 楼宇列表

  @TOAD-211 
  Scenario: 楼宇列表排序
    Given 登录后台
    And 用户在楼宇列表页面
    When 按房源面积降序排序
    Then 列表按房源面积降序排序

  @TOAD-820 
  Scenario Outline: 新建楼宇所属客户联想
    Given 登录后台
    And 用户在楼宇列表页面
    When 在所属客户输入框输入内容 "<content>"
    Then 展示联想客户 "<contract>"

    Examples: 
      | content | contract     |
      | 匠人      | 匠人 |

  @TOAD-242 
  Scenario: 新建楼宇信息填写缺失
    Given 登录后台
    And 用户在楼宇列表页面
    And 新建楼宇不填信息
    Then 提示错误信息

  @TOAD-252 
  Scenario: 编辑楼宇信息填写缺失
    Given 登录后台
    And 用户在楼宇列表页面
    And 编辑楼宇清空一条信息保存
    Then 提示错误信息

#新版本不要这个功能
  @TOAD-802 
  Scenario: 楼宇列表增加是否禁用
    Given 登录后台
    And 用户在楼宇列表页面
    Then 楼宇列表展示是否禁用

  @TOAD-249 
  Scenario: 删除协助管理人
    Given 登录后台
    And 用户在楼宇列表页面
    And 删除协助管理人
    Then 协助管理人被删除

  @TOAD-248 
  Scenario: 添加多个协助管理人
    Given 登录后台
    And 用户在楼宇列表页面
    When 点击协助管理人右侧添加图标
    Then 添加协助管理人下拉框，添加图标和删除图标

  @TOAD-234 
  Scenario: 楼宇列表头部数据展示
    Given 登录后台
    And 用户在楼宇列表页面
    Then 表头展示总楼宇数、总在租面积和总房源面积

  @TOAD-819 
  Scenario Outline: 楼宇操作记录
    Given 登录后台
    And 用户在楼宇列表页面
    When 编辑楼宇名称 "<buildingName>"
    Then 展示操作记录 "<record>"

    Examples: 
      | buildingName | record     |
      | 测试大楼12       | 修改楼宇[楼宇名称] |

  @TOAD-803 
  Scenario: 楼宇详情增加数据
    Given 登录后台
    And 用户在楼宇列表页面
    Then 楼宇详情展示房源数、录入合同数、在租面积、房源面积