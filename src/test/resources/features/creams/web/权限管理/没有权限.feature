@MAR-4088
Feature: 权限管理-没有权限

  @MAR-2086 @AcceptenceTest @CreamsWebNotAuthoritiesTest @xywu
  Scenario Outline: 去掉内部管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    Then 进入内部管理页面
    And 新建人员按钮为灰色

    Examples:
      | customerName | authority |
      | 权限测试         | 内部人员管理    |

  @MAR-11329 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉查看所有人租赁合同权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority3>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在租赁合同列表
    Then 用户只能看到自己的租赁合同

    Examples:
      | customerName | authority1 | authority2 | authority3 |
      | 权限测试         | 租赁合同新建     | 租赁合同审核     | 查看所有人合同    |

  @MAR-11330 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉查看所有人物业合同权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority3>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在物业合同列表
    Then 用户只能看到自己的物业合同

    Examples:
      | customerName | authority1 | authority2 | authority3 |
      | 权限测试         | 物业合同新建     | 物业合同审核     | 查看所有人物业合同  |

  @MAR-11331 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉查看所有人招商数据权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理客户管理列表
    Then 用户只能看到自己的招商数据

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 客户管理权限     | 查看所有人招商数据  |

  @MAR-11332 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉查看预算报表权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估预算列表
    Then 弹出提示您没有此项操作的权限
    And 页面显示抱歉!您无权查看该页面

    Examples:
      | customerName | authority |
      | 权限测试         | 查看预算报表    |

  @MAR-11333 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉编辑预算报表权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估预算列表
    Then 编辑按钮不能点击

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 查看预算报表     | 编辑预算报表     |

  @MAR-11334 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉房源标签管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    Then 房源标签按钮不能点击

    Examples:
      | customerName | authority |
      | 权限测试         | 标签管理      |

  @MAR-11335 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉租客标签管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    Then 租客标签按钮不能点击

    Examples:
      | customerName | authority |
      | 权限测试         | 标签管理      |


  @MAR-11336 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉行业管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    And 进入行业管理
    Then 添加行业按钮不能点击

    Examples:
      | customerName | authority |
      | 权限测试         | 行业管理      |

  @MAR-11345 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉费用类型管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    And 进入费用类型管理
    Then 新增按钮不能点击

    Examples:
      | customerName | authority |
      | 权限测试         | 费用类型管理    |

  @MAR-11451 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉退租原因管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在自定义管理页面
    And 进入退租原因管理
    Then 新增按钮不能点击

    Examples:
      | customerName | authority |
      | 权限测试         | 退租原因管理    |

  @MAR-11454 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉资产评估权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在资产评估资产收益列表
    Then 页面显示抱歉!您无权查看该页面

    Examples:
      | customerName | authority |
      | 权限测试         | 资产评估      |

  @MAR-11457 @xywu @AcceptenceTest @CreamsWebHasAuthoritiesTest
  Scenario Outline: 去掉我的渠道权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理我的渠道列表
    Then 页面显示抱歉!您无权查看该页面

    Examples:
      | customerName | authority1 | authority2 |
      | 权限测试         | 客户管理权限     | 我的渠道       |


  @MAR-11535 @CreamsWebNotAuthoritiesTest @xywu @AcceptenceTest
  Scenario Outline: 去掉物业合同模版管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入物业合同模板页面
    Then 新增模版按钮变灰

    Examples:
      | customerName | authority |
      | 权限测试         | 物业合同模板管理  |


  @MAR-990 @CreamsWebNotAuthoritiesTest @xywu @AcceptenceTest
  Scenario Outline: 去掉合同模版管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入合同模板页面
    Then 新增模版按钮变灰

    Examples:
      | customerName | authority |
      | 权限测试         | 合同模板管理    |

  @MAR-2100 @AcceptenceTest @CreamsWebNotAuthoritiesTest @xywu
  Scenario Outline: 去掉客户管理权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 用户在招商管理客户管理列表
    Then 页面显示抱歉!您无权查看该页面

    Examples:
      | customerName | authority |
      | 权限测试         | 客户管理权限    |

  @MAR-1001 @AcceptenceTest @CreamsWebNotAuthoritiesTest @xywu
  Scenario Outline: 去掉房源编辑权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入房源管理
    Then 房源编辑按钮为灰

    Examples:
      | customerName | authority |
      | 权限测试         | 房源编辑      |


  @MAR-11720 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 去掉财务编辑权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    And 该账号退出登陆
    When 子账号登陆
    And 进入收付款账单页面
    Then 用户不能新建账单

    Examples:
      | customerName | authority |
      | 权限测试         | 财务编辑权限    |


  @MAR-11725 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 去掉租赁合同修改权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 勾选权限 "<authority1>"
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority2>"
    And 该账号退出登陆
    When 子账号登陆
    Then 用户不能编辑该份合同信息"<building>"

    Examples:
      | customerName | authority1 | authority2 | building |
      | 权限测试         | 租赁合同新建     | 租赁合同修改     | 楼宇名称     |

  @MAR-11762 @AcceptenceTest @CreamsWebHasAuthoritiesTest @xywu
  Scenario Outline: 去掉租赁合同审核权限
    Given 管理员登录
    And 进入内部管理页面
    And 进入用户权限页面"<customerName>"
    And 去掉权限 "<authority>"
    When 进入审核流程编辑
    Then 不能看到该人出现在右侧审核候选人之内

    Examples:
      | customerName | authority |
      | 权限测试         | 租赁合同审核    |


