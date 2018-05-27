@tag
Feature: 新建需求
  测试一下新建需求

  @newDemand @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(租金方式为日租金，填写佣金分成)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>"
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"   
    
    Examples: 
      | 用户名         | 密码       | 区域   | 面积区间    | 租金区间 | 装修 |         需求描述      | 佣金分成 | 姓名         |       区域:  |  面积租金                        | 
      | 18969187523   | Creams820 | 上城区 | 100-200   | 1-2     | 简装 | 这价格便宜点Automation | 三七开  | 测试号  | 	区域：上城区 | 面积价格：100-200m² · 1-2元/m²·天 | 
 
 
  @newDemand @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(选择默认租金方式，不填写佣金分成)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>"
    And 填写面积区间 "<面积区间>"
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>"

    Examples: 
      | 用户名         | 密码       | 区域   | 面积区间    | 租金区间 | 装修 |        需求描述       | 姓名     |     区域:    | 面积租金        | 
      | 18969187523   | Creams820 | 上城区  | 100-200   | 1-2     | 简装 | 这价格便宜点Automation |  测试号  | 区域：上城区  | 面积价格：100-200m² · 1-2元/m²·天 |
      
   
  @CreamsIOSTesting @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(选择租金方式为月租金)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>" 
    And 填写租金方式 "<租金方式>", 填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域：>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"

    Examples: 
      | 用户名         | 密码       | 区域   | 面积区间    | 租金方式 | 租金区间  | 装修 |        需求描述       | 佣金分成  | 姓名   |     区域：    |     面积租金       | 
      | 18969187523   | Creams820 | 上城区  | 100-200   |  月租金  | 90-120   | 简装 | 这价格便宜点Automation |  三七开  | 测试号  | 区域：上城区  | 面积价格：100-200m²以上 · 90-120元/m²·月 |
  
  
  @newDemand @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(手动输入面积的最小值)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 手动填写面积区间的最小值 "<面积最小值>" 
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"

    Examples: 
      | 用户名         | 密码       | 区域   | 面积最小值 |  租金区间  | 装修 |        需求描述       | 佣金分成  | 姓名   |     区域:    |     面积租金       | 
      | 18969187523   | Creams820 | 上城区  |     0    |   1-2    |  简装 | 这价格便宜点Automation |  三七开  | 测试号  |    区域：上城区  | 面积价格：0m²以上 · 1-2元/m²·天    |


  @newDemand @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(手动输入面积的最大值)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 手动填写面积区间的最大值 "<面积最大值>" 
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>"
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"

    Examples: 
      | 用户名         | 密码       | 区域   | 面积最大值 |  租金区间  | 装修 |        需求描述       | 佣金分成  | 姓名   |     区域:    |     面积租金       | 
      | 18969187523   | Creams820 | 上城区  |     1000    |   1-2    |  简装 | 这价格便宜点Automation |  三七开  | 测试号  |  区域：上城区    | 面积价格：0-1000m² · 1-2元/m²·天    |
      
      
  @newDemand @KOOP-1162 @KOOP-1504
  Scenario Outline: 不修改城市发布需求(手动输入面积的最小值和最大值)
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 填写区域 "<区域>" 
    And 手动填写面积区间的最小值 "<面积最小值>"和面积区间的最大值 "<面积最大值>"
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>"
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"

    Examples: 
      | 用户名         | 密码       | 区域   | 面积最小值 | 面积最大值 |  租金区间  | 装修 |        需求描述       | 佣金分成  | 姓名   |     区域:    |     面积租金       | 
      | 18969187523   | Creams820 | 上城区  |    1     |  1000    |   1-2    |  简装 | 这价格便宜点Automation |  三七开  | 测试号  |  区域：上城区    | 面积价格：1-1000m² · 1-2元/m²·天    |

      
  @newDemand  @KOOP-1506 @KOOP-1447
  Scenario Outline: 手动修改城市后发布需求
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击需求tab页进入需求大厅
    When 点击新建需求按钮
    And 滑动城市为 "<城市>"
    And 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>" 
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    And 点击我tab进入我的主页
    And 点击我的需求按钮进入我的需求页
    Then 存在姓名为"<姓名>"发布需求成功
    And "<姓名>"的需求信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"
    
    Examples: 
      | 用户名         | 密码       |  城市   |区域   | 面积区间    | 租金区间 | 装修 | 需求描述             | 佣金分成  | 姓名         | 区域:       | 面积租金        | 
      | 18969187523 | Creams820  | 北京市 |东城区  | 100-200    | 1-2    | 简装 | 这价格便宜点Automation | 三七开  | 测试号  | 区域：东城区      | 面积价格：100-200m² · 1-2元/m²·天  |
      
  
  @newDemand @KOOP-1503
  Scenario Outline: 在房源首页手动切换城市后发布需求
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    And 点击房源tab进入房源首页
    When 在房源首页切换城市为 "<新城市>"
    And 点击需求tab页进入需求大厅
    And 点击新建需求按钮
    Then 城市内容填充正确 "<新城市>"
    When 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>" 
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
   Then 需求列表中存在刚刚发布的需求 "<姓名>"，需求发布成功
    And "<姓名>"信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"
  #重置定位城市
    When 点击返回按钮回到我的主页
    And 点击房源tab进入房源首页
    And 在房源首页切换城市为 "<城市>"
    Then 城市 "<城市:>"重置成功
    
    Examples: 
      | 用户名         | 密码       | 新城市 |区域   | 面积区间    | 租金区间 | 装修 | 需求描述             | 佣金分成  | 姓名         | 区域:        | 面积租金        | 城市|城市:|
      | 18969187523 | Creams820 |  北京市|东城区 | 100-200    | 1-2    | 简装 | 这价格便宜点Automation | 三七开  | 测试号  | 区域：东城区       | 面积价格：100-200m² · 1-2元/m²·天  | 杭州市|杭州|
      
      
  @newDemand @KOOP-1445
  Scenario Outline: 定位城市已开通，发布需求时城市字段的默认填充
    Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
    When 点击需求tab页进入需求大厅
    And 点击新建需求按钮
    Then 城市内容填充正确 "<默认城市>"
    When 填写区域 "<区域>" 
    And 填写面积区间 "<面积区间>" 
    And 填写租金方式为默认租金方式，填写租金区间 "<租金区间>" 
    And 填写装修 "<装修>"
    And 填写需求描述 "<需求描述>" 
    And 填写佣金分成 "<佣金分成>"
    And 点击提交按钮
    And 点击关闭按钮
    And 点击我tab进入我的主页
    And 点击我的需求按钮进入我的需求页
    Then 存在姓名为"<姓名>"发布需求成功
    And "<姓名>"的需求信息显示正确 "<区域:>" "<面积租金>" "<装修>" "<需求描述>" "<佣金分成>"
    
    Examples: 
      | 用户名         | 密码       | 默认城市 |区域   | 面积区间    | 租金区间 | 装修 | 需求描述             | 佣金分成  | 姓名         | 区域:        | 面积租金        | 
      | 18969187523 | Creams820 |  杭州市  |上城区 | 100-200    | 1-2    | 简装 | 这价格便宜点Automation | 三七开  | 测试号  | 区域：上城区       | 面积价格：100-200m² · 1-2元/m²·天  | 
      