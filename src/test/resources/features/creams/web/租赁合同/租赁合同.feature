@MAR-4088
Feature: 租赁合同
  为了能使用creams网页的主要功能
  作为网页的使用者
  I want

  #等新建待审核，关闭申请&删除合同用例写完后一起跑
  @MAR-1252  @jyyang
  Scenario Outline: 在集合情况下新建合同流程
    Given 用户登录
    And 选择单一楼宇"<building>"，在租赁页面
    When 点击新建合同按钮
    And 输入基本信息"<renter>" "<building>" ，点击下一步
    And 进入费用条款，并输入信息 "<deposit>" "<payType>" "<advancePaytime>" "<basePrice>" "<dayNumberForYear>""<keepDecimalPoint>"
    And 生成租金明细
    And 点击保存合同按钮
    Then 提示创建成功

    Examples:
      | renter | building | deposit | payType | advancePaytime | basePrice | dayNumberForYear | keepDecimalPoint |
      | 租客租客   | 楼宇名称     | 1       | 1       | 1              | 1         | 1                | 2                |


  @MAR-1292 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 新建合同，删除递增率
    Given 用户登录
    And 在租赁页面
    And 点击新建合同按钮
    And 进入合同的费用条款页"<renter>" "<building>"
    And 新增一条递增率
    When 点击递增率右上角的删除按钮
    Then 可删除该条递增率模块

    Examples:
      | renter | building |
      | 租客租客   | 合同楼      |

  @MAR-1259 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 新建合同，点击楼盘右侧的展开按钮
    Given 用户登录
    And 选择单一楼宇"<building>"，在租赁页面
    When 点击新建合同按钮
    When 不点击楼盘图片，只点击楼盘右侧的展开按钮"<building>"
    Then 该楼盘的房源信息展开

    Examples:
      | building |
      | 合同楼      |

  @MAR-8969 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 查看合同详情
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 在租赁页面
    When 点击列表合同"<contract>"
    Then 进入租赁合同详情页

    Examples:
      | contract | building |
      | 租客租客     | 合同楼      |

#编辑合同部分保存时有需求，并存在bug
  @MAR-2889  @jyyang
  Scenario Outline: 编辑合同，重新发送账单
    Given 用户登录
    And 选择单一楼宇"<building>"，在租赁页面
    When hover列表合同"<contract>"，点击编辑合同
    Then 进入租赁合同编辑页
    And 点击保存合同按钮
    And 勾选重新发送账单，确定

    Examples:
      | building | contract |
      | 合同楼      | 租客租客     |

    #编辑合同部分保存时有需求，并存在bug
  @MAR-2890  @jyyang
  Scenario Outline: 编辑合同，不重新发送账单
    Given 用户登录
    And 选择单一楼宇"<building>"，在租赁页面
    When hover列表合同"<contract>"，点击编辑合同
    Then 进入租赁合同编辑页
    And 点击保存合同按钮
    And 不勾选重新发送账单，确定

    Examples:
      | contract |
      | 租客租客     |


  @MAR-1317 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 新建备注
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 用户进入房源侧滑栏页面
    And 用户进入合同详情侧滑栏
    And 用户进入备注侧滑栏
    When 在输入框中输入备注内容"<remark>"
    And 点击备注提交
    Then 备注提交成功提醒
    And 新建一份时间为当前的备注
    And 清空输入框"<remark>"
    And 删除这条备注

    Examples:
      | building | remark    |
      | 楼宇名称     | 我是一条新增的备注 |

  @MAR-1319 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 编辑备注
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 用户进入房源侧滑栏页面
    And 用户进入合同详情侧滑栏
    And 用户进入备注侧滑栏
    And 在输入框中输入备注内容"<remark>"
    And 点击备注提交
    When 点击这条备注的编辑图标
    And 输入框内容为原备注内容"<remark>"
    And 点击备注修改提交按钮
    And 删除这条备注

    Examples:
      | building | remark    |
      | 楼宇名称     | 我是一条新增的备注 |


    #编辑合同部分保存时有需求，并存在bug
  @MAR-1394 @jyyang
  Scenario Outline: 编辑合同 重新生成租金明细
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 用户进入房源侧滑栏页面
    And 用户进入合同详情侧滑栏
    When 点击编辑按钮，进入合同编辑页面
    And 修改条款之后基础单价"<basePrice>"
    And 点击生成租金明细
    Then 点击合同编辑保存按钮

    Examples:
      | building | basePrice |
      | 楼宇名称     | 2         |

    #编辑合同部分保存时有需求，并存在bug
  @MAR-1395  @jyyang
  Scenario Outline: 编辑合同 不重新生成租金明细
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 用户进入房源侧滑栏页面
    And 用户进入合同详情侧滑栏
    When 点击编辑按钮，进入合同编辑页面
    And 修改条款之后基础单价"<basePrice>"
    Then 点击合同编辑保存按钮

    Examples:
      | building | basePrice |
      | 楼宇名称     | 2         |

  @MAR-1245 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario: 展示距离当前时间点，合同结束日还有90天即将到期的所有合同
    Given 用户登录
    And 在租赁页面
    When 选择了到期预警
    Then 到期预警按钮高亮

  @MAR-6303 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 审核不通过时，编辑租赁合同，合同编号为不能编辑状态
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<customername>"，选择相应的租客名的租赁合同
    And 用户新建租赁合同后被审核不通过，编辑租赁合同
    Then 合同编号处于不能编辑状态（因为合同编号只有第一次审核通过后才能被赋予）

    Examples:
      | FloorName | customername |
      | wd的楼2号    | 不通过编辑合同编号    |

    #操作记录格式变化，且不同环境账号不同，之后解决
  @MAR-5449  @jyyang
  Scenario Outline: 合同跟进人修改(主要是看操作记录）
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<customername>"，选择相应的租客名的租赁合同
    And 有合同指派权限的用户进入合同编辑页面
    When 将合同跟进人从修改为了
    Then 进入合同操作记录中显示

    Examples:
      | FloorName | customername |
      | wd的楼2号    | 修改跟进人        |
      | wd的楼2号    | 修改跟进人        |

  @MAR-5479  @jyyang
  Scenario Outline: 续租合同查看上一份合同
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    And 用户进入续租合同详情页，点击查看上一份合同按钮
    Then 划出该合同续租前的合同详情页
    And  删除名为"<customername>"的续租合同

    Examples:
      | FloorName | roomnum | customername |
      | wd的楼2号    | 原始合同    | 续签合同         |

    # no such element: Unable to locate element: {"method":"xpath","selector":"//div[text()='续签合同']/parent::div/parent::td"}
  @MAR-5421  @jyyang
  Scenario Outline: 续签合同,不对上一份做退租处理、保证金转交动作
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    And 用户从A租客的租赁合同页面续签一份B"<followcustomername>"合同
    And 通过审核
    Then 进到房源"<roomnum>"中查看，B合同标为“续租”合同
    And 删除名为"<followcustomername>"的续租合同

    Examples:
      | FloorName | roomnum | customername | followcustomername |
      | wd的楼2号    | 来续租阿    | 原始的合同        | 续签的合同              |

  @MAR-6072
  Scenario Outline: 返还作废合同的合同编号
    Given 用户登录
    And 用户在楼宇新建/编辑中勾选了返还作废合同的合同编号
    When 该楼宇存在同期同合同编号规则作废合同
    And 该楼宇同期同合同编号规则合同审核通过
    Then 该新审核通过的合同编号使用该规则内的最小合同编号（包括作废、使用后编辑修改掉的）

    Examples:
      | FloorName | roomnum | customername | followcustomername |
      | wd的楼2号    | 来续租阿    | 原始的合同        | 续签的合同              |


  @MAR-1253 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 在单一楼宇情况下新建合同流程
    Given 用户登录
    And 进入单一楼宇"<FloorName>"剖面图
    And 选择房号"<roomNum>"
    When 点击新建租赁合同按钮
    And 输入基本信息"<renter>"，点击下一步
    And 基本条款修改开始时间"<startDate>" , 结束时间"<endDate>"
    And 进入费用条款，并输入信息 "<deposit>" "<payType>" "<advancePaytime>" "<basePrice>" "<dayNumberForYear>""<keepDecimalPoint>"
    And 生成租金明细
    And   点击保存&发起审批
    And   选择相应的租客名为"<renter>"的租赁合同
    Then  查看审核并通过审核

    Examples:
      | renter | FloorName | roomNum | startDate  | endDate | deposit | payType | advancePaytime | basePrice | dayNumberForYear | keepDecimalPoint |
      | 退租数据检查 | wd的楼2号    | 退租数据检查  | 2018/05/06 | 计租三年    | 1       | 3       | 1              | 200       | 365              | 2                |


  @MAR-1372 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 打开新建退租协议
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    When 点击右下角退租按钮
    Then 弹出退租协议

    Examples:
      | FloorName | roomnum | customername |
      | wd的楼2号    | 退租数据检查  | 退租数据检查       |


  @MAR-11340 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 租赁合同退租时退租协议数据检查及账单处理
    Given 用户登录
    And   选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    When  进入退租协议
    And   选择退租日期 "<terminationDate>"
    And  历史账单显示:费用类型 "<costType>"、计费周期 "<billDate>" 、账单类型 "<billType>" 、账单金额 "<theoryAmount>",实收/付金额 "<money>"  、实际收入/支出 "<actual>"
    And   费用总计显示总计应收 "<total>"
    And   点击保存&提交
    And   查看审核，并通过审核
    And   页面刷新，重新选择房号"<roomnum>",选择相应的租客名为"<customername>"的租赁合同
    And   合同状态为"<status>"
    And   单击查看合同账单列表进入合同账单列表
    Then  账单列表显示租金退租结算账单"<primeAmount>"

    Examples:
      | FloorName | roomnum | customername | terminationDate | costType | billDate                | billType | theoryAmount | money | actual | total  | status | primeAmount |
      | wd的楼2号    | 退租数据检查  | 退租数据检查       | 2018-06-30      | 租金       | 2018-05-06 - 2018-08-05 | 收款       | 604.93       | 0.00  | 368.22 | 368.22 | 已退租    | 368.22      |


  @MAR-11341 @AcceptenceTest @CreamsWebContractTest  @jyyang
  Scenario Outline: 租赁合同作废并关闭所有账单
    Given 用户登录
    And   选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    When  点击作废按钮
    And   填写作废原因"<reason>"
    And   选择"<deal>"账单处理方式
    And   查看审核，并通过审核
    And   进入收付款账单页面
    Then 验证账单被删除 "<customername>"

    Examples:
      | FloorName | roomnum | customername | reason        | deal   |
      | wd的楼2号    | 退租数据检查  | 退租数据检查       | 合同作废并关闭所有账单测试 | 关闭所有账单 |

  @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 在单一楼宇情况下新建合同流程
    Given 用户登录
    And 进入单一楼宇"<FloorName>"剖面图
    And 选择房号"<roomNum>"
    When 点击新建租赁合同按钮
    And 输入基本信息"<renter>"，点击下一步
    And 基本条款修改开始时间"<startDate>" , 结束时间"<endDate>"
    And 进入费用条款，并输入信息 "<deposit>" "<payType>" "<advancePaytime>" "<basePrice>" "<dayNumberForYear>""<keepDecimalPoint>"
    And 生成租金明细
    And   点击保存&发起审批
    And   选择相应的租客名为"<renter>"的租赁合同
    Then  查看审核并通过审核

    Examples:
      | renter     | FloorName | roomNum    | startDate  | endDate | deposit | payType | advancePaytime | basePrice | dayNumberForYear | keepDecimalPoint |
      | 作废并关闭未处理账单 | wd的楼2号    | 作废并关闭未处理账单 | 2018/05/06 | 计租三年    | 1       | 3       | 1              | 200       | 365              | 2                |

  @MAR-11343 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 租赁合同作废并关闭未处理账单
    Given 用户登录
    And   选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    When  点击作废按钮
    And   填写作废原因"<reason>"
    And   选择"<deal>"账单处理方式
    And   查看审核，并通过审核
    And   进入收付款账单页面
    Then  验证账单被删除 "<customername>"

    Examples:
      | FloorName | roomnum    | customername | reason        | deal      |
      | wd的楼2号    | 作废并关闭未处理账单 | 作废并关闭未处理账单   | 合同作废并关闭所有账单测试 | 关闭所有未收款账单 |

  @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 在单一楼宇情况下新建合同流程
    Given 用户登录
    And 进入单一楼宇"<FloorName>"剖面图
    And 选择房号"<roomNum>"
    When 点击新建租赁合同按钮
    And 输入基本信息"<renter>"，点击下一步
    And 基本条款修改开始时间"<startDate>" , 结束时间"<endDate>"
    And 进入费用条款，并输入信息 "<deposit>" "<payType>" "<advancePaytime>" "<basePrice>" "<dayNumberForYear>""<keepDecimalPoint>"
    And 生成租金明细
    And   点击保存&发起审批
    And   选择相应的租客名为"<renter>"的租赁合同
    Then  查看审核并通过审核

    Examples:
      | renter | FloorName | roomNum | startDate  | endDate | deposit | payType | advancePaytime | basePrice | dayNumberForYear | keepDecimalPoint |
      | 作废合同测试 | wd的楼2号    | 作废合同测试  | 2018/05/06 | 计租三年    | 1       | 3       | 1              | 200       | 365              | 2                |

  @MAR-11344 @AcceptenceTest @CreamsWebContractTest @jyyang
  Scenario Outline: 租赁合同作废并不处理账单
    Given 用户登录
    And   选择楼宇"<FloorName>",进入剖面图选择房号"<roomnum>"，选择相应的租客名为"<customername>"的租赁合同
    When  点击作废按钮
    And   填写作废原因"<reason>"
    And   选择"<deal>"账单处理方式
    And   查看审核，并通过审核
    And   进入收付款账单页面
    Then  验证账单没有被删除 "<customername>"
    And   删除账单

    Examples:
      | FloorName | roomnum | customername | reason        | deal |
      | wd的楼2号    | 作废合同测试  | 作废合同测试       | 合同作废并关闭所有账单测试 | 不处理  |
