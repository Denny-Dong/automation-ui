@MAR-4986
Feature: 合同详情操作

  @CreamsAPPAndroid @MAR-3321 @pengxingyue
  Scenario Outline: 【合同详情】已有历史审核的新建待审核的合同查看新建审核
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航
    And 点击合同列表
    And 点击搜索合同
    And 输入租客"<租客>"
    And 点击租客信息包含租客"<租客>"的合同进入合同详情
    When 点击右上角操作按钮
    And 点击查看新建审核进入审核流程页面
    Then 历史审核操作信息 提交人信息"<账号>" "<时间>" 审核信息 "<审核状态>" "<审核账号>" "<审核时间>" "<审核不通过原因>" 显示正确
    And 当前审核流程信息 提交人信息"<提交账号>" "<提交时间>" 等待审核信息"<等待审核人>"显示正确

    Examples: 
      | 邮箱                 | 密码      |        楼宇       | 租客     | 账号  | 时间         | 审核状态  | 审核账号 | 审核时间    |         审核不通过原因                   | 提交账号 | 提交时间    | 等待审核人 |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 新建待审核 | 小破孩 | 2018/04/16 | 审核不通过 | 小破孩  | 2018/04/18 | auto已有历史审核的新建待审核的合同查看审核流程 | 小破孩  | 2018/04/18 | 小破孩    |

  @CreamsAPPAndroid @MAR-3325 @pengxingyue
  Scenario Outline: 【合同详情】提交退租审核的合同查看退租协议
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航
    And 点击合同列表
    And 点击搜索合同
    And 输入租客"<租客>"
    And 点击租客信息包含租客"<租客>"的合同进入合同详情
    When 点击右上角操作按钮
    And 点击查看退租协议进入退租协议页面
    Then 租客信息 退租发起方"<退租发起方>"  退租面积"<退租面积>" 退租日期"<退租日期>" 工商注册地址变更时间"<工商注册地址变更时间>"显示正确
    And 房源信息 所属楼宇"<所属楼宇>" 楼宇地址"<楼宇地址>" 楼层房号"<楼层房号>" 面积"<面积>" 显示正确
    And 退租前账单 租金日期"<租金日期>" 账单金额"<账单金额1>" 实收/付金额"<实收/付金额>" 实际收入/支出"<实际收入/支出>" 总计应收"<总计应收1>"显示正确
    And 保证金 账单金额"<账单金额2>" 实收金额"<实收金额>" 总计应退"<总计应退>"显示正确
    And 其他费用 实际收入 "<实际收入>" 备注 "<备注>" 总计应收"<总计应收2>"显示正确
    And 费用总计 保证金结算"<保证金结算>" 账单结算"<账单结算>" 其他费用"<其他费用>" 总计应收"<总计应收3>"显示正确
    And 退租原因 "<退租原因>"显示正确
    And 备注信息 "<备注信息>"显示正确

    Examples: 
      | 邮箱                  | 密码       | 楼宇         | 租客    | 退租发起方 |  退租面积   | 退租日期     | 工商注册地址变更时间 |     所属楼宇       |     楼宇地址           | 楼层房号   | 面积      | 租金日期                | 账单金额1  | 实收/付金额 |实际收入/支出| 总计应收1  | 账单金额2  |实收金额| 总计应退| 实际收入 | 备注     | 总计应收2   | 保证金结算 | 账单结算  | 其他费用   | 总计应收3   | 退租原因 | 备注信息   |
      | xypeng@91souban.com | Pexy6666 |自动化测试（不要动）| 退租待修改 | 退租待修改 | 217.54m² | 2018/04/16  |   2018/04/16    | 自动化测试（不要动） | 杭州市/建德市/不要动我的楼 | 6层 604室 | 217.54m² | 2018/02/27-2018/05/26 | 56147.07 |   0.00    | 20818.58 | 20818.58元 | 19188.84 | 0.00 | 0.00元 | 500.00 | 其他费用测试 | 500.00元 | 0.00元 | 20818.58元 | 500.00元 | 21318.58元 | 交通不便 | 备注信息测试 |

  @CreamsAPPAndroid @MAR-4968 @pengxingyue
  Scenario Outline: 【合同详情】查看退租待修改状态下的合同退租审核
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航
    And 点击合同列表
    And 点击搜索合同
    And 输入租客"<租客>"
    And 点击租客信息包含租客"<租客>"的合同进入合同详情
    When 点击右上角操作按钮
    And 点击查看退租审核进入退租审核页面
    Then 历史审核操作信息 提交人信息"<账号>" "<时间>" 审核信息 "<审核状态>" "<审核账号>" "<审核时间>" "<审核不通过原因>" 显示正确
    And 不显示当前审核流程

    Examples: 
      | 邮箱                  | 密码     | 楼宇              | 租客    |  账号  | 时间         | 审核状态  | 审核账号 | 审核时间    | 审核不通过原因 |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 退租待修改 | 小破孩 | 2018/04/16 | 审核不通过 | 小破孩  | 2018/04/18 | 审核不通过测试 |

  @CreamsAPPAndroid @MAR-3330 @pengxingyue
  Scenario Outline: 【合同详情】首次提交作废申请的合同查看作废审核
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航
    And 点击合同列表
    And 点击搜索合同
    And 输入租客"<租客>"
    And 点击租客信息包含租客"<租客>"的合同进入合同详情
    When 点击右上角操作按钮
    And 点击查看作废审核进入作废审核页面
    Then 当前审核流程信息 提交人信息"<提交账号>" "<提交时间>" 等待审核信息"<等待审核人>"显示正确

    Examples: 
      | 邮箱                  | 密码     | 楼宇             | 租客      | 提交账号 | 提交时间    | 等待审核人 |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 作废待审核 | 小破孩  | 2018/04/16 | 小破孩   |

  @CreamsAPPAndroid @MAR-3328 @pengxingyue
  Scenario Outline: 【合同详情】提交作废审核的合同查看作废原因
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航
    And 点击合同列表
    And 点击搜索合同
    And 输入租客"<租客>"
    And 点击租客信息包含租客"<租客>"的合同进入合同详情
    When 点击右上角操作按钮
    And 点击查看作废原因进入作废原因页面
    Then 页面中 作废原因"<作废原因>"和账单处理"<账单处理>"显示正确

    Examples: 
      | 邮箱                  | 密码     | 楼宇              | 租客     | 作废原因               | 账单处理 |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 作废待审核 | auto作废待审核作废原因测试 | 不处理  |
