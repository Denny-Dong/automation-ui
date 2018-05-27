@MAR-4088
Feature: 审批流程

  @MAR-8782 @AcceptenceTest @CreamsWebOaTest @xywu
  Scenario Outline: 新建租赁合同之后观察整个审批流程过程（加上设置临时审批人）
    Given 用户登录
    #And 选中单一楼宇"<FloorNameOnly>"
    And 选择楼宇"<buildingName>",进入剖面图选择房号"<roomName>"新建租赁人为"<customername>"租赁合同
    And 提交人新建合同成功，设置临时审批人"<checkpeople>"
    Then 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract>"并点开该记录
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 临时审批人通过该审核
    Then 审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为"<contractAbstract>"
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    And 是否状态为"<Statu>"
    Then 进入合同详情页看是否显示"<contractStatus>"

    Examples:
      | buildingName | roomName | checkpeople | customername | contractAbstract   | Statu | contractStatus |
      | 测试审批流程2号     | 合同流程     |   联系人1        | 新租审核         | 测试审批流程2号/合同流程/新租审核 | 审批完结  | 正常执行           |

  @MAR-8929  @AcceptenceTest @CreamsWebOaTest @xywu
  Scenario Outline: 续签租赁合同之后观察整个审批流程过程（加入关闭申请和再次申请）
    Given 用户登录
    And 选择楼宇"<buildingName>",进入剖面图选择房号"<roomName>"新建租赁人为"<customername>"租赁合同
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract1>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract1>"
    And 进入该合同同详情页面，对该租赁合同进行续签，续签的租客名为"<customernameNext>"，然后发起审核
    And 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract2>"并点开该记录
    And 然后进入该合同审核，点击关闭申请
    And 是否状态为"<Statu>"
    And 再次进入该审核界面点击“再次申请”来发起再次审批
    Then 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract2>"并点开该记录
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract2>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    Then 审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为"<contractAbstract2>"
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract2>"
    Then 进入合同详情页看是否显示"<contractStatus>"

    Examples:
      | buildingName | roomName | customername | customernameNext | contractAbstract1      | contractAbstract2        | Statu | contractStatus |
      | wd的楼2号       | 合同流程2号   | original     | descendant       | wd的楼2号/合同流程2号/original | wd的楼2号/合同流程2号/descendant | 已撤回   | 待执行            |

  @MAR-9101 @CreamsWebOaTest @xywu
  Scenario Outline: 退租租赁合同之后观察整个审批流程过程（加入设置退租合同审核流程的默认审批人）
    Given 用户登录
    And 选择租赁审核种类为"<contractApprovalKinds>"进行编辑，选择楼宇名"<buildingName>"的默认审核人为"<checker>"
    And 选择楼宇"<buildingName>",进入剖面图选择房号"<roomName>"新建租赁人为"<customername>"租赁合同
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Given 进入该合同的详情页面，对该租赁合同,勾选退租原因"<endReason>"进行退租
    Then 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract>"并点开该记录
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    Then 审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为"<contractAbstract>"
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Then 进入合同详情页看是否显示"<contractStatu>"

    Examples:
      | buildingName | contractApprovalKinds | roomName | customername | contractAbstract   | checker | endReason | contractStatu |
      | wd的楼2号       | 退租合同审核流程              | 合同流程2号   | 退租审流         | wd的楼2号/合同流程2号/退租审流 | 联系人1    | 物业服务      | 已退租           |

  @MAR-10060 @CreamsWebOaTest @xywu
  Scenario Outline: 作废租赁合同之后观察整个审批流程过程
    Given 用户登录
    And 选择租赁审核种类为"<contractApprovalKinds>"进行编辑，选择楼宇名"<buildingName>"的默认审核人为"<checker>"
    And 选择楼宇"<buildingName>",进入剖面图选择房号"<roomName>"新建租赁人为"<customername>"租赁合同
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Given 进入该合同的详情页面，点击作废，填写作废原因并且发起审核
    Then 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract>"并点开该记录
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    Then 审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为"<contractAbstract>"
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Then 进入合同详情页看是否弹框显示“关联合同已作废或已删除”

    Examples:
      | buildingName | contractApprovalKinds | roomName | customername | contractAbstract   | checker |
      | wd的楼2号       | 作废合同审核流程              | 合同流程2号   | 作废审流         | wd的楼2号/合同流程2号/作废审流 | 联系人1    |


  Scenario Outline: 新建物业合同后观察整个审判流程
    Given 用户登录
    And 选择租赁审核种类为"<contractApprovalKinds>"进行编辑，选择楼宇名"<buildingName>"的默认审核人为"<checker>"
    And 选择楼宇"<buildingName>",进入剖面图选择房号"<roomName>"新建租赁人为"<customername>"租赁合同
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Given 进入该合同的详情页面，点击作废，填写作废原因并且发起审核
    Then 进入“我发起的”界面查看是否有此租赁合同的申请记录，合同摘要显示"<contractAbstract>"并点开该记录
    And 进入待我审批界面，查看是否有该合同的审核申请，该合同的合同摘要为"<contractAbstract>"
    And 进入该审核申请的合同审核界面
    And 通过该合同的审核
    Then 审核通过后，该审核申请在“待我审批”中消失，消失的合同摘要为"<contractAbstract>"
    And 进入我已审批查看处理结果，是否合同摘要为"<contractAbstract>"
    Then 进入合同详情页看是否弹框显示“关联合同已作废或已删除”

    Examples:
      | buildingName | contractApprovalKinds | roomName | customername | contractAbstract   | checker |
      | wd的楼2号       | 作废合同审核流程              | 合同流程2号   | 作废审流         | wd的楼2号/合同流程2号/作废审流 | 联系人1    |

  @MAR-6432 @AcceptenceTest @CreamsWebOaTest @xywu
  Scenario Outline: 存在一个审批人审核不通过时不能点击“关闭申请”
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    And 选择一个租客名为"<customername>"的租赁合同，该审核处于“新建待修改状态”
    Then 用户点开“查看审核”不能“关闭申请”（无此按钮）

    Examples:
      | roomNum   | customername |
      | 无“关闭申请”按钮 | 无“关闭申请”按钮    |

  @MAR-5505 @CreamsWebAuthorityManagementTest @xywu
  Scenario: 我已审批列表
    Given 用户登录
    And 用户进入工作流的审批模块
    When 进入我已审批列表
    Then 列表显示所有该用户已审批的合同审批,点击审批，出现审批需求弹框

  @MAR-5969 @CreamsWebAuthorityManagementTest @xywu
  Scenario Outline: 提交人设置临时审批人(包含临时审批时新建和作废租赁合同步奏）
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<roomName>"来新建租赁人为"<customername>"租赁合同
    And 提交人新建合同成功，设置审批人"<checkpeople>"
    When 通过该"<customername>"审核
    Then 然后进入该房间详情页面，作废用户为"<customername>"的租赁合同,选择审核人"<checkpeople>"

    Examples:
      | FloorName | roomName | customername | checkpeople |
      | 测试审批流程2号  | 来测临时审批   | 测试临时审批人      | 联系人1        |

  @MAR-6793  @xywu
  Scenario Outline: 作废待修改状态“编辑“作废原因“后保存
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<customername>"，选择相应的租客名的租赁合同
    Then 编辑“作废原因”，点击保存，此时重新发起审核
    And 返回上一步，使该审核不通过

    Examples:
      | FloorName | customername |
      | wd的楼2号    | 测试作废待修改      |

  @MAR-6794  @xywu
  Scenario Outline: “退租待修改”状态点击编辑“退租原因”后保存
    Given 用户登录
    And 选择楼宇"<FloorName>",进入剖面图选择房号"<customername>"，选择相应的租客名的租赁合同
    Then 编辑“退租原因”，点击保存，此时重新发起审核
    And 使该审核不通过，保持退租待修改状态

    Examples:
      | FloorName | customername |
      | wd的楼2号    | 测试退租待修改      |

  @MAR-5504 @CreamsWebAuthorityManagementTest @xywu
  Scenario: 待我审批列表
    Given 用户登录
    And 用户进入工作流的审批模块
    When 进入待我审批列表
    Then 列表显示所有该用户当前需要审批的合同审批，点击想要审批的申请，出现审批需求弹框