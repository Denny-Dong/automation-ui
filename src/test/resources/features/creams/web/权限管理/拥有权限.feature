@MAR-4088
Feature: 权限管理-拥有权限

  @MAR-2085 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选内部管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    Then 用户可以新建人员

    Examples:
      | customerName | authority |
      | 权限测试         | 内部人员管理    |

  @MAR-11323 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选查看所有人合同权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在租赁合同列表
    Then 用户可以看到所有人的租赁合同

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 查看所有人合同    | 租赁合同新建     |

  @MAR-11324 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选查看所有人物业合同权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在物业合同列表
    Then 用户可以看到所有人的物业合同

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 查看所有人物业合同  | 物业合同新建     |

  @MAR-11325 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选查看所有人招商数据权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理客户管理列表
    Then 用户可以看到所有人的招商数据

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 查看所有人招商数据  | 客户管理权限     |

  @MAR-11326 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选查看预算报表权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估预算列表
    Then 用户可以看到预算列表

    Examples:
      | customerName | authority |
      | 权限测试         | 查看预算报表    |

  @MAR-11327 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选编辑预算报表权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估预算列表
    Then 编辑按钮可以点击

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 查看预算报表     | 编辑预算报表     |

  @MAR-11449 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选费用类型管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    And 进入费用类型管理
    Then 新增按钮可以点击

    Examples:
      | customerName | authority |
      | 权限测试         | 费用类型管理    |

  @MAR-11450 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选退租原因管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    And 进入退租原因管理
    Then 新增按钮可以点击

    Examples:
      | customerName | authority |
      | 权限测试         | 退租原因管理    |

  @MAR-11453 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 勾选资产评估权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估资产收益列表
    Then 用户可以看到资产收益图

    Examples:
      | customerName | authority |
      | 权限测试         | 资产评估      |

  @MAR-2456 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选租赁合同审核权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    When 进入审核流程编辑
    Then 可以看到该人出现在右侧审核候选人之内

    Examples:
      | customerName |authority|
      | 权限测试         |租赁合同审核   |

  @MAR-2106 @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 人员权限编辑页面，对租赁合同新建权限进行勾选
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选租赁合同新建权限
    And 该账号退出登陆
    When 子账号登陆
    Then 用户可以在集合和单一楼宇下点击进入租赁合同tab
    And 用户在房源侧滑栏可以看到租赁合同卡片"<building>"

    Examples:
      | customerName | building |
      | 权限测试         | 楼宇名称     |

  @MAR-2101 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 人员权限编辑页面，对需求大厅权限进行勾选
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选需求大厅权限
    And 该账号退出登陆
    When 子账号登陆
    Then 用户可以点击进入招商板块下的需求大厅tab

    Examples:
      | customerName |
      | 权限测试         |

  @MAR-2099 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选房源编辑权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入房源管理
    Then 房源编辑按钮可点击

    Examples:
      | customerName | authority |
      | 权限测试         | 房源编辑      |

  @MAR-2450 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选财务编辑权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入收付款账单页面
    Then 用户可以新建账单

    Examples:
      | customerName | authority |
      | 权限测试         | 财务编辑权限    |

  @MAR-2097 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 人员权限编辑页面，对楼宇、楼层管理权限进行勾选
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 人员权限编辑页面，对楼宇、楼层管理权限进行勾选
    And 该账号退出登陆
    When 子账号登陆
    Then 楼宇管理里面hover编辑楼宇可以点击"<building>"
    And 加楼宇按钮可以点击

    Examples:
      | customerName | building |
      | 权限测试         | 楼宇名称     |

  @MAR-2107 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选租赁合同修改权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    Then 用户可以合同侧滑栏里编辑该份合同信息"<building>"

    Examples:
      | customerName | authority1 | authority2 | building |
      | 权限测试         | 租赁合同新建     | 租赁合同修改     | 楼宇名称     |

  @MAR-2103 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选我的渠道权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理我的渠道列表
    Then 用户可以看到我的渠道列表

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 客户管理权限     | 我的渠道       |

  @MAR-2098 @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选合同模板权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入合同模板页面
    Then 新增模版按钮可以点击

    Examples:
      | customerName | authority |
      | 权限测试         | 合同模板管理    |

  @MAR-11534 @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选物业合同模板权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入物业合同模板页面
    Then 新增模版按钮可以点击

    Examples:
      | customerName | authority |
      | 权限测试         | 物业合同模板管理  |


  @MAR-11537 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 勾选客户管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理客户管理列表
    Then 用户可以看到客户管理列表

    Examples:
      | customerName | authority |
      | 权限测试         | 客户管理权限    |
