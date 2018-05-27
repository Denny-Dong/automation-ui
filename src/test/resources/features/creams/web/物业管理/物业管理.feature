@MAR-4088
Feature: 物业管理

  @MAR-6842 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业列表结束日筛选
    Given 用户登录
    And 进入物业合同列表
    When 筛选结束日 "<startDate>", "<endDate>"
    Then 列表显示匹配筛选日的合同 "<startDate>", "<endDate>"

    Examples:
      | startDate  | endDate    |
      | 2018/01/22 | 2019/06/22 |

  @MAR-6843 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业列表审核状态的筛选
    Given 用户登录
    And 进入物业合同列表
    When 筛选审核状态为 "<Status>"
    Then 列表全是状态"<Status>"的合同

    Examples:
      | Status |
      | 新建待修改  |

  @MAR-6844 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario: 物业列表面积的排序
    Given 用户登录
    And 进入物业合同列表
    When 点击面积降序排序
    Then 列表根据面积降序排序

  @MAR-6877 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario: 查看物业合同侧滑栏
    Given 用户登录
    And 进入物业合同列表
    When 进入物业合同侧滑栏
    Then 可以查看物业合同详情

  @MAR-6895 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 新增物业合同
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同页面
    When 新建物业合同 "<renter>" "<deposit>"
    Then 提示新建成功
    And 审核通过

    Examples:
      | building | renter | deposit |
      | xywu楼    | 租客租客   | 1       |

  @MAR-6899 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业合同退租
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同列表
    When 退租物业合同
    And 审核通过
    Then 退租物业合同成功
    When 进入收付款账单页面
    Then 生成物业退租结算账单

    Examples:
      | building |
      | xywu楼    |

  @MAR-6896 @xywu
  Scenario Outline: 新增物业合同(基本信息关联)
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    When 点击添加物业合同
    Then 自动填充基本信息

    Examples:
      | roomNum |
      | 601     |

  @MAR-6898 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业合同作废并关闭账单
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同列表
    When 作废物业合同 "<processBills>"
    And 审核通过
    And 进入收付款账单页面
    Then 验证账单被删除 "<renter>"

    Examples:
      | building | processBills | renter |
      | xywu楼    | 关闭所有账单       | 租客租客   |

  @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 新增物业合同
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同页面
    When 新建物业合同 "<renter>" "<deposit>"
    Then 提示新建成功
    And 审核通过

    Examples:
      | building | renter | deposit |
      | xywu楼    | 租客租客   | 1       |

  @MAR-11217 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业合同作废并关闭所有未收款账单
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同列表
    When 作废物业合同 "<processBills>"
    And 审核通过
    And 进入收付款账单页面
    Then 验证账单被删除 "<renter>"

    Examples:
      | building | processBills | renter |
      | xywu楼    | 关闭所有未收款账单    | 租客租客   |

  @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 新增物业合同
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同页面
    When 新建物业合同 "<renter>" "<deposit>"
    Then 提示新建成功
    And 审核通过

    Examples:
      | building | renter | deposit |
      | xywu楼    | 租客租客   | 1       |

  @MAR-11218 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 物业合同作废并不处理账单
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 进入物业合同列表
    When 作废物业合同 "<processBills>"
    And 审核通过
    And 进入收付款账单页面
    Then 验证账单没有被删除 "<renter>"
    And 删除账单

    Examples:
      | building | processBills | renter |
      | xywu楼    | 不处理          | 租客租客   |


  @MAR-6848 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario Outline: 归档合同列表结束日筛选
    Given 用户登录
    And 进入归档合同列表
    When 筛选结束日 "<startDate>", "<endDate>"
    Then 列表显示匹配筛选日的合同 "<startDate>", "<endDate>"

    Examples:
      | startDate  | endDate    |
      | 2018/01/22 | 2019/06/22 |

  @MAR-6850 @CreamsWebPropertyContractTest @AcceptenceTest @xywu
  Scenario: 归档合同列表面积的排序
    Given 用户登录
    And 进入归档合同列表
    When 点击面积降序排序
    Then 列表根据面积降序排序
