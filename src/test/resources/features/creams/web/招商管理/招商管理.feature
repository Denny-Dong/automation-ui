@MAR-4088
Feature: 招商管理
  I want to 检查招商列表

  @MAR-1014 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 根据访问时间排序
    Given 用户登录
    And 左侧楼宇在选择两个楼宇的情况下，用户进入portfolio的招商列表页
    When 点击来访时间升序并检查列表
    And 点击来访时间降序并检查列表
    And 点击选择来访时间旁边的筛选时间按钮按钮相对应的时间 "<finishdate>" "<startdate>"
    Then 来访时间的排序显示在这一时间段内的来访时间 "<finishdate>" "<startdate>"

    Examples: 
      | finishdate | startdate  |
      | 2017/07/07 | 2018/08/08 |

  @MAR-1011 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 根据渠道排序
    Given 用户登录
    And 左侧楼宇在选择两个楼宇的情况下，用户进入portfolio的招商列表页
    When 点击渠道筛选按钮
    Then 选择筛选条件 "<channelsname>"
    And 列表数据展示效果为筛选结果展示效果 "<channelsname>"
    And 在筛选条件处显示“选择大楼：某某大楼/选择大楼：某某大楼/排序：渠道”

    Examples: 
      | channelsname |
      | 上门           |

  @MAR-1009 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario: 根据需求面积排序
    Given 用户登录
    And 左侧楼宇在选择两个楼宇的情况下，用户进入portfolio的招商列表页
    When 点击需求面积段从大到小排序按钮
    And 需求列表根据从大到小排列
    And 点击需求面积段从小到大排序按钮
    And 需求列表根据从小到大排列
    Then 在筛选条件处显示“选择大楼：某某大楼/选择大楼：某某大楼/排序：需求面积段”

  @MAR-856 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 创建需求
    Given 用户登录
    When 用户进入招商管理点击新建需求
    And 出现新建需求弹窗
    And 检查预计签约时间和来访时间为当日
    And 租客状态为初次接触
    And 输入其他必填项(租客、需求面积、选择房源) "<renter>" "<choosehousing>"
    And 点击保存
    Then 检查招商列表中出现新建的需求 "<renter>"

    Examples: 
      | renter | choosehousing |
      | 张三     | 招商需求专用测试楼     |

  @MAR-830
  Scenario Outline: 删除需求
    Given 用户登录
    When 用户进入招商管理点击新建需求
    And 出现新建需求弹窗
    And 检查预计签约时间和来访时间为当日
    And 租客状态为初次接触
    And 输入其他必填项(租客、需求面积、选择房源) "<renter>" "<choosehousing>"
    And 点击保存
    When 进入详情页"<renter>"
    And 删除需求
    Then 删除需求成功 "<renter>"

    Examples: 
      | renter | choosehousing |
      | 张三     | 招商需求专用测试楼     |

  @MAR-868 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 新建租客联系人
    Given 用户登录
    Given 用户进入招商管理点击新建需求
    And 租客联系人名称已填 "<renter>"
    And 租客联系人未在联想列表中
    When 点击新建租客联系人
    And 输入租客电话 "<tell>"
    And 保存新建联系人
    Then 再次输入该租客时该租客在联想列表中  "<renter>"

    Examples: 
      | renter | tell       |
      | 功夫皇帝   | 1234567890 |

  @MAR-834 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 新增备注
    Given 用户登录
    When 用户进入需求侧滑栏
    And 点击备注按钮
    And 展开输入框输入备注信息并提交 "<notes>"
    Then 出现备注提交成功的提示
    And 备注列表中出现一条新增该条备注信息 "<notes>"

    Examples: 
      | notes   |
      | 自动化测试备注 |

  @MAR-845 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 删除备注
    Given 用户登录
    When 用户进入需求侧滑栏
    And 点击备注按钮
    And 展开输入框输入备注信息并提交 "<notes>"
    And 出现备注提交成功的提示
    And 删除备注
    Then 弹窗提示确认删除这条备注
    And 删除成功

    Examples: 
      | renter | notes   |
      | 张三     | 自动化测试备注 |

  @MAR-887 @AcceptenceTest @CreamsWebMarketingTest @mycheng
  Scenario Outline: 新建提醒
    Given 用户登录
    And 用户进入需求侧滑栏
    When 点击提醒按钮
    Then 新建提醒 "<contents>"
    And 新建提醒成功提醒
    And 关闭提醒设置页面
    And 检查新建的提醒 "<contents>"

    Examples: 
      | contents |
      | 自动化提醒测试  |
