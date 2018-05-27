@MAR-4088
Feature: 剖面图

  Background: 
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面，当前有物业合同信息
      | roomNum |
      | 测试合同    |
    Then 清空物业合同
      | hiremanname |
      | 小红          |
    And 该账号退出登陆

  @MAR-2448 @AcceptenceTest @CreamsWebRoomSectionTest @xywu
  Scenario: 进入剖面图房源侧滑栏
    Given 用户登录
    And 当前用户所在剖面图页面
    When 点击任何一个房源
    Then 右侧栏划出房源详情页，展示楼层房号信息、面积、招商状态、预租单价、装修，以及编辑按钮、删除按钮图标、历史操作按钮图标，租赁合同信息、客户信息、物业合同信息

  @MAR-2453 @AcceptenceTest @CreamsWebRoomSectionTest @xywu
  Scenario Outline: : 从剖面图房源侧滑栏进行编辑房源操作
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    When 点击房源编辑按钮
    Then 弹窗打开房源编辑页面

    Examples: 
      | roomNum |
      | 哈哈      |

  @MAR-2457
  Scenario Outline: 从剖面图房源侧滑栏进行添加物业合同操作（房源存在物业合同的情况下新建物业合同）
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前有物业合同信息
    When 新增物业合同，填写物业合同详细信息"<hiremanname>" "<propertytype>""<staticmoney>""<propertyprice>""<propertyweek>""<payday>""<powerwasteprice>""<powermoneyweek>""<powerpayday>"
    Then 新建客户"<hiremanname>"的物业合同成功
    And 删掉客户为"<hiremanname>"的物业合同

    Examples: 
      | hiremanname | propertytype | staticmoney | propertyprice | propertyweek | payday | powerwasteprice | powermoneyweek | powerpayday | roomNum |
      | 小红          | 写字楼          |        1000 |            10 |            1 |      3 |              10 |              1 |           4 | 测试合同    |

  @MAR-2460
  Scenario Outline: 从剖面图房源侧滑栏进行添加物业合同操作（房源中不存在物业合同的情况下新建物业合同）
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前物业合同信息无合同存在
    When 新增物业合同，填写物业合同详细信息"<hiremanname>" "<propertytype>""<staticmoney>""<propertyprice>""<propertyweek>""<payday>""<powerwasteprice>""<powermoneyweek>""<powerpayday>"
    Then 新建客户"<hiremanname>"的物业合同成功
    And 删掉客户为"<hiremanname>"的物业合同

    Examples: 
      | hiremanname | propertytype | staticmoney | propertyprice | propertyweek | payday | powerwasteprice | powermoneyweek | powerpayday | roomNum |
      | 小红          | 写字楼          |           0 |            10 |            1 |      3 |              10 |              1 |           4 | 哈哈      |

  @MAR-2462 @AcceptenceTest @CreamsWebRoomSectionTest @xywu
  Scenario Outline: 从剖面图房源侧滑栏进行添加客户操作（房源中存在客户的情况下，新增客户）
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前有客户信息
    When 新建客户，填写客户信息 "<customername>"
    Then 弹窗新建客户，新建成功最显示最上方显示客户名称"<customername>"已有客户信息往下排列，最新排在最上

    Examples: 
      | customername | roomNum |
      | 小则           | 哈哈      |

  @MAR-2463 @CreamsWebRoomSectionTest @AcceptenceTest @xywu
  Scenario Outline: 从剖面图房源侧滑栏进行添加客户操作（房源中不存在客户的情况下，新增客户）
    Given 用户登录
    And 用户进入选择新增窗口
    When 选择了对应的楼宇，填写完整所有必填项（楼层、房号、招商状态）"<building>""<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 点击了保存并提交
    And 已进入剖面图房源侧滑栏页面，进入新创建测房源"<roomNum>"当前客户信息无客户存在
    When 新建客户，填写客户信息 "<customername>"
    Then 新建客户"<customername>"成功
    And 删除带"<customername>"该房源

    Examples: 
      | customername | building | floor | roomNum | roomArea | merchantsState |
      | 小则           | wd测试楼    |     1 | 宝宝楼     |   100.00 | 可招商            |

  @MAR-2466 @CreamsWebRoomSectionTest @AcceptenceTest @xywu
  Scenario Outline: 从剖面图房源侧滑栏进行添加租赁合同操作
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前租赁合同信息无合同存在
    When 新增租赁合同，填写租赁合同详细信息"<myCustomer>"费用条款"<keepmoney>""<basicmoney>"
    Then 新建租赁合同"<myCustomer>"成功
    And 删除客户为"<myCustomer>"的租赁合同

    Examples: 
      | myCustomer | keepmoney | basicmoney | roomNum |
      | 小强         |      1000 |         10 | 哈哈      |

  @MAR-2452 @CreamsWebRoomSectionTest @AcceptenceTest @xywu
  Scenario Outline: 从剖面图房源侧滑栏进行删除房源操作
    Given 用户登录
    And 用户进入选择新增窗口
    And 选择了对应的楼宇，填写完整所有必填项（楼层、房号、招商状态）"<building>""<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 点击了保存并提交
    When 已进入剖面图房源侧滑栏页面,点击删除按钮, 删除带"<roomNum>"的房源
    Then 弹出二次确认框，确认之后，删除带"<roomNum>"的房源成功，剖面图房源详情页收回，返回剖面图页面

    Examples: 
      | building | floor | roomNum | roomArea | merchantsState |
      | wd测试楼    |     1 | 宝宝楼     |   100.00 | 可招商            |

  @MAR-7460 @CreamsWebRoomSectionTest @AcceptenceTest @xywu
  Scenario Outline: 新建客户必填租客名
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前有客户信息
    And 点击新增租客未输入租客名称，直接点击保存
    Then 租客名下方出现提示“请填写姓名或公司”，无法保存

    Examples: 
      | roomNum |
      | 哈哈      |
