@MAR-4088
Feature: 租客管理
  As a : 用户
  I want to : 新建合同的时候选择租客
  So that I can : 新建的时候确认租客

  @MAR-8726 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客新建
    Given 用户登录
    And 进入租客管理页面
    When 点击新建租客按钮
    Then 输入租客名称  "<tenant>"，并选择联想租客 "<tenantName>"
    And 保存租客
    And 清除租客状态选项
    And 租客新建成功 "<tenantName>"

    Examples: 
      | tenant | tenantName  |
      | 娃哈哈    | 杭州娃哈哈集团有限公司 |

  @MAR-8728 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客楼宇筛选
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 筛选一个楼宇"<building>"
    Then 租客列表显示的楼宇都是筛选的楼宇"<building>"

    Examples: 
      | building |
      | 楼宇名称     |

  @MAR-7370 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客详情页
    Given 用户登录
    And 进入租客管理页面
    When 点击新建租客按钮
    And 输入租客名称  "<tenant>"，并选择联想租客 "<tenantName>"
    And 保存租客
    Then 清除租客状态选项
    And 进入租客 "<tenantName>"的详情页
    And 显示租客详细信息

    Examples: 
      | tenant | tenantName  |
      | 娃哈哈    | 杭州娃哈哈集团有限公司 |

  @MAR-7381 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客详情页新增租赁合同
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 进入租客 "<tenantName>"的详情页
    And 点击新增租赁合同按钮
    And 合同选择房源"<building>"
    And 点击下一步
    Then 补充押金、基础单价、生成租金明细 "<deposit>""<price>"
    And 保存并且新建成功

    Examples: 
      | tenantName  | building | deposit | price |
      | 杭州娃哈哈集团有限公司 | 测试审核流程   |     300 |    30 |

  @MAR-7382 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客详情页新增物业合同
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 进入租客 "<tenantName>"的详情页
    And 点击新增物业合同按钮
    And 合同选择房源"<building>"
    And 点击下一步
    Then 补充押金、支付类型、提前付款时间、基础单价，生成物业明细"<deposit>" "<payType>" "<advancePayDate>" "<price>"
    And 保存并且新建成功

    Examples: 
      | tenantName  | building | deposit | payType | advancePayDate | price |
      | 杭州娃哈哈集团有限公司 | 测试审核流程   |     300 |         |                |    30 |

  @MAR-7411 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客详情页点击工商信息
    Given 用户登录
    And 进入租客管理页面
    When 点击新建租客按钮
    And 输入租客名称  "<tenant>"，并选择联想租客 "<tenantName>"
    And 保存租客
    Then 清除租客状态选项
    And 进入租客 "<tenantName>"的详情页
    And 点击查看工商信息

    Examples: 
      | tenant | tenantName  |
      | 娃哈哈    | 杭州娃哈哈集团有限公司 |

  @MAR-8733 @CreamsWebTenantTest @AcceptenceTest @jyyang
  Scenario Outline: 租客详情页新增租赁合同（保存&发起审核）
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 进入租客 "<tenantName>"的详情页
    And 点击新增租赁合同按钮
    And 合同选择房源"<building>"
    And 点击下一步
    Then 补充押金、基础单价、生成租金明细 "<deposit>""<price>"
    And 保存并且发起审核
    When 至少选择一个审批人"<approvaler>"
    And 删除审批人"<approvaler>"
    And 提交审核，且提交失败"<errorMessage>"
    And 至少选择一个审批人"<approvaler>"
    Then 创建审核成功"<message>"

    Examples: 
      | tenantName  | building | deposit | price | approvaler | message | errorMessage |
      | 杭州娃哈哈集团有限公司 | 测试审核流程   |     300 |    30 | 联系人1       | 创建成功    | 请至少选择一人      |

  @MAR-8732 @CreamsWebTenantTest @AcceptenceTest @jyyang
  Scenario Outline: 租客详情页新增物业合同（保存&发起审核）
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 进入租客 "<tenantName>"的详情页
    And 点击新增物业合同按钮
    And 合同选择房源"<building>"
    And 点击下一步
    Then 补充押金、支付类型、提前付款时间、基础单价，生成物业明细"<deposit>" "<payType>" "<advancePayDate>" "<price>"
    And 保存并且发起审核
    When 至少选择一个审批人"<approvaler>"
    And 删除审批人"<approvaler>"
    And 提交审核，且提交失败"<errorMessage>"
    And 至少选择一个审批人"<approvaler>"
    Then 创建审核成功"<message>"

    Examples: 
      | tenantName  | building | deposit | payType | advancePayDate | price | approvaler | message | errorMessage |
      | 杭州娃哈哈集团有限公司 | 测试审核流程   |     300 |       3 |              3 |    30 | 联系人1      | 创建成功    | 请至少选择一人      |

  @MAR-8730 @CreamsWebTenantTest @AcceptenceTest @jyyang
  Scenario Outline: 删除租客
    Given 用户登录
    And 进入租客管理页面
    And 清除租客状态选项
    When 进入租客 "<tenant>"的详情页
    Then 删除租客
    And 列表无该租客信息

    Examples: 
      | tenant      |
      | 杭州娃哈哈集团有限公司 |



  @MAR-11374 @CreamsWebTenantTest @AcceptenceTest @mycheng
  Scenario Outline: 租客管理列表数据检查
    Given 用户登录
    And 进入租客管理页面
    When 点击新建租客按钮
    Then 输入租客名称  "<tenant>"，并选择联想租客 "<tenantName>"
    And 保存租客
    And 清除租客状态选项
    When 重置自定义列并选中"<listName>"
    And 检查格式是否正确



    Examples:
      | tenant | tenantName        | listName |
      | 娃哈哈  | 杭州娃哈哈集团有限公司 |  核准日期|






    