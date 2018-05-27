@MAR-4088
Feature: 收付款
  I want to 编辑账单

  @MAR-2009 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 新建付款账单没有填写付款记录提交
    Given 用户登录
    And 用户进入新建收款账单弹框
    When 全部填写收款账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    Then 出现对应用户的未结清付款账单"<payer>"

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  |
      | 物业费  | 2017-09-15 | 2017-11-01 |   8383 | 2017-12-15 | 用户    | 招商需求专用测试楼 |

  @MAR-2010 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 新建付款账单填写付款记录提交
    Given 用户登录
    And 用户进入新建付款账单弹框
    When 全部填写账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 填写付款信息必填项 "<realamount>" "<realtime>" "<realpayer>" ,用户勾选添加收支流水
    And 提交账单

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  | realamount | realtime   | realpayer |
      | 物业费  | 2017-09-15 | 2017-11-01 |   9999 | 2017-12-15 | 肤浅    | 招商需求专用测试楼 |       9999 | 2017-09-05 | 世纪        |

  @MAR-2008
  Scenario Outline: 新建付款账单，楼宇多选-功能取消
    Given 用户登录
    And 用户进入新建付款账单弹框
    And 全部填写账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    When 勾选另一个房源信息 "<building2>"
    And 提交账单
    Then 提交，账单在俩个楼宇的账单列表中都出现"<payer>"

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  | building2 |
      | 物业费  | 2017-09-15 | 2017-11-01 |   1000 | 2017-12-15 | 肤浅    | 招商需求专用测试楼 | 测试楼       |

  @MAR-2011 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario: 付款账单详情页
    Given 用户登录
    And 进入收付款账单页面
    And 清除筛选条件
    When 点击某一账单
    Then 右侧划出账单详情页，展示账单信息，房源信息，收支流水，开票记录，调整

  @MAR-2012 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario: 账单添加收支流水提示框
    Given 用户登录
    And 进入收付款账单页面
    And 用户筛选未结清账单
    When 点击某一账单
    And 点击添加收支流水按钮
    Then 弹出添加收支流水弹框

  @MAR-2013 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario: 账单添加收支流水
    Given 用户登录
    And 进入收付款账单页面
    And 用户筛选未结清账单
    When 点击某一账单
    And 点击添加收支流水按钮
    And 弹出添加收支流水弹框
    Then 提交成功，提示『添加付款信息成功』，并刷新账单详情页信息，账单增加一笔付款记录

  @MAR-2016 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单关闭
    Given 用户登录
    And 进入收付款账单页面
    And 清除筛选条件
    And 点击某一账单
    When 点击关闭账单，输入关闭原因"<reason>"
    Then 确认关闭

    Examples: 
      | reason |
      | 测试关闭账单 |

  @MAR-2020 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 删除账单提示框
    Given 用户登录
    And 进入收付款账单页面
    And 用户进入新建付款账单弹框
    And 全部填写账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    And 用户筛选未结清账单
    And 搜索租客名称"<payer>"
    When 点击某一账单
    And 点击删除账单按钮
    Then 出现确认框，是否确认删除

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  |
      | 物业费  | 2017-09-15 | 2017-11-01 |   8383 | 2017-12-15 | 用户    | 招商需求专用测试楼 |

  @MAR-2021 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单删除
    Given 用户登录
    And 进入收付款账单页面
    And 用户进入新建付款账单弹框
    And 全部填写账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    And 用户筛选未结清账单
    And 搜索租客名称"<payer>"
    When 点击某一账单
    And 点击删除账单按钮
    Then 点击确认删除

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  |
      | 物业费  | 2017-09-15 | 2017-11-01 |   8383 | 2017-12-15 | 用户    | 招商需求专用测试楼 |

  @MAR-1996 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario: 收付款进入收付款列表默认选项设置
    Given 用户登录
    When 用户点击收付款
    Then 默认展示收款账单列表，并且默认选中本期账单，列表显示本期账单的列表本期账单快捷选项和逾期账单快捷选项显示账单数量和应收金额。

  @MAR-2003 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单状态筛选
    Given 用户登录
    And 用户点击收付款
    When 用户筛选未结清账单
    Then 当前筛选条件栏增加，"<statues>" 的筛选选项，列表刷新，显示选中的账单状态的账单数据

    Examples: 
      | statues |
      | 未结清     |

  @MAR-2001 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单费用类型筛选
    Given 用户登录
    And 用户点击收付款
    When 筛选了费用类型 "<billtype>"
    Then 当前筛选条件栏增加，"<billtype>"的筛选选项，列表刷新，显示选中的费用类型账单数据

    Examples: 
      | billtype |
      | 租金       |

  @MAR-2024 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario: 收款账单详情页
    Given 用户登录
    And 用户点击收付款
    And 清除筛选条件
    When 点击某一账单
    Then 右侧划出账单详情页，展示账单信息，房源信息，收支流水，开票记录，调整

  @MAR-4192 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单应收值调整
    Given 用户登录
    And 用户点击收付款
    And 筛选账单为收款且未结清
    And 点击某一账单
    And 添加了调整金额  "<Adamount>", 选择调整类型为零头减免"<Adtype>"
    Then 调整成功并确认

    Examples: 
      | Adamount | Adtype |
      |        1 | 特批调整   |

  @MAR-4193 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单调整删除
    Given 用户登录
    And 用户点击收付款
    And 筛选账单为付款账单且未结清
    When 点击某一账单
    And 添加了调整金额  "<Adamount>", 选择调整类型为零头减免"<Adtype>"
    Then 调整成功并确认
    And 删除了调整

    Examples: 
      | Adamount | Adtype |
      |        1 | 特批调整   |

  @MAR-4142 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 添加账单备注
    Given 用户登录
    And 用户点击收付款
    And 清除筛选条件
    When 点击某一账单
    And 点击备注图标
    And 输入备注 "<notes>"
    Then 账单添加备注

    Examples: 
      | notes  |
      | 账单备注测试 |

  @MAR-4783 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario: 账单匹配收支流水
    Given 用户登录
    And 用户点击收付款
    And 用户筛选未结清账单
    When 点击某一账单
    And 账单匹配流水
    Then 账单与流水匹配

  @MAR-4111 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 新建收支流水
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 点击新建收支流水
    And 输入发生额、入账时间、对方单位名称 "<iamount>""<itime>""<iname>"
    Then 点击保存，新建流水成功

    Examples: 
      | iamount | itime      | iname |
      |    1000 | 2017-09-09 | lala  |

  @MAR-4106 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 批量删除
    Given 用户登录
    And 用户点击收付款
    And 用户进入收支流水列表
    And 点击新建收支流水
    And 输入发生额、入账时间、对方单位名称 "<iamount>""<itime>""<iname>"
    And 点击保存，新建流水成功
    When 勾选了几个流水
    And 点击删除流水按钮
    Then 弹窗提示确认删除x条流水？确认后删除

    Examples: 
      | iamount | itime      | iname |
      |    1000 | 2017-09-09 | lala  |

  @MAR-4123 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 手动匹配流水和账单
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 清除筛选条件
    And 筛选收支流水的"<matchstate>"
    And 点击某一条流水
    And 匹配账单
    Then 确定匹配账单
    And 匹配该收支流水和账单

    Examples: 
      | matchstate |
      |  部分匹配       |

  @MAR-4126 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario: 收支流水取消匹配账单
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 筛选收支流水为已匹配
    Then 点击某一条流水
    And 删除流水的匹配

  @MAR-4102 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 收支流水借贷标筛选
    Given 用户登录
    And 用户点击收付款
    And 用户进入收支流水列表
    When 筛选"<cmark>"
    Then 列表仅展示筛选的"<marklist>"的收支流水

    Examples: 
      | cmark | marklist |
      | 借     | 借（支出）    |
      | 贷     | 贷（收入）    |

  @MAR-4116 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 已匹配账单跳转
    Given 用户登录
    And 用户点击收付款
    And 用户进入收支流水列表
    And 清除筛选条件
    And 筛选收支流水的"<matchstate>"
    When 点击某一条流水
    And 匹配账单
    And 确定匹配账单
    And 点击确定匹配
    Then 点击匹配的账单
    And 可以返回

    Examples: 
      | matchstate |
      | 未匹配        |

  @MAR-4122 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 匹配默认值检查
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 清除筛选条件
    And 筛选收支流水的"<matchstate>"
    And 点击某一条流水
    And 匹配账单
    Then 匹配金额为账单未匹配和流水未匹配的较小值
  Examples:
  | matchstate |
  | 未匹配        |

  @MAR-4101 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 收支流水匹配状态筛选
    Given 用户登录
    And 用户点击收付款
    And 用户进入收支流水列表
    And 清除筛选条件
    When 筛选收支流水的"<matchstate>"
    Then 列表仅展示筛选 "<matchstate>"的收支流水

    Examples: 
      | matchstate |
      | 已匹配        |
      | 未匹配        |
      | 部分匹配       |

  @MAR-4105 @AcceptenceTest @CreamsWebFinanceTest @mycheng
  Scenario Outline: 收支流水列表搜索（对方单位名称）
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 输入搜索信息并搜索"<sname>"
    Then 列表刷新显示对方单位名称和搜索内容匹配的收支流失"<sname>"

    Examples: 
      | sname |
      | lala  |

  @MAR-4202 @AcceptenceTest @CreamsWebFinanceBillsTest @mycheng
  Scenario Outline: 账单生成票发信息
    Given 用户登录
    And 用户进入新建收款账单弹框
    When 全部填写收款账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    And 清除筛选条件
    Then 勾选这条账单
    And 点击开票
    And 开票信息界面出现勾选中可开票的账单的开票信息

    Examples: 
      | type | starttime  | finishtime | amount | time       | payer | building  |
      | 物业费  | 2017-09-15 | 2017-11-01 |   8383 | 2017-09-15 | 用户    | 招商需求专用测试楼 |

  @MAR-4210
  Scenario: 开票
    Given 用户登录
    And 进入收付款账单页面
    When 勾选一条非保证金的账单
    And 点击开票
    And 输入开票信息
    Then 保存发票(虚拟发票)至账单和开票记录列表

  @MAR-4935 @mycheng
  Scenario Outline: 售方信息新增
    Given 用户登录
    And 用户进入开票设置
    When 进入售方信息
    And 点击“+信息”按钮
    And 填写了信息并提交 "<sname>","<taxpayerN>","<address>","<tell>","<bank>","<account>"
    Then 保存该售方信息 "<sname>"

    Examples: 
      | sname | taxpayerN           | address | tell        | bank | account |
      | 自然糖   | 1234561232121212121 | 杭州      | 15800011111 | 招行   | 9999999 |

  @MAR-4938 @mycheng
  Scenario Outline: 货物名称新建
    Given 用户登录
    And 用户进入开票设置
    When 进入货物名称
    And 点击“+信息”按钮，选择自建
    And 填写了货物信息并提交 "<gname>","<number>","<tax>"

    Examples: 
      | gname | number              | tax  |
      | 棒棒糖   | 1234561232121212121 | 0.17 |

  @MAR-5517 @mycheng
  Scenario Outline: 编辑售方信息
    Given 用户登录
    And 用户进入开票设置
    When 进入售方信息
    And 点击编辑按钮，更改信息 "<sname>"
    Then 售方信息名称被更改 "<sname>"

    Examples: 
      | sname |
      | 黄金进口  |
