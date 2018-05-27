Feature: 内部管理
  I want to 检查内部管理的设置

  @MAR-8902
  Scenario: 进入账户设置页面
    Given 用户登录
    When 进入内部管理页面
    Then 进入账户设置页面
    And 返回内部管理主页面

  @MAR-8905
  Scenario Outline: 新增租赁合同添加关键词并在内部管理检查
    Given 用户登录
    And 在租赁合同页面
    And 点击新建合同按钮
    And 输入租客名称"<tenantName>"
    And 合同选择房源"<building>"
    And 新增一个关键词"<keyword>"
    And 点击下一步
    Then 补充押金、基础单价、生成租金明细 "<deposit>""<price>"
    And 保存并且新建成功
    And 进入租赁合同关键词页面"<building>"
    And 检查该楼宇下的关键词"<keyword>"

    Examples:
      | tenantName  | building | keyword | deposit | price |
      | 杭州娃哈哈饮料有限公司 | 测试审核流程   | fds     | 300     | 30    |

  @MAR-8951
  Scenario Outline: 设置关键词不显示在租赁合同查看
    Given 用户登录
    When 进入租赁合同关键词页面"<building>"
    And 不显示关键词"<keyword>"
    And 返回内部管理主页面
    And 在租赁合同页面
    And 点击新建合同按钮
    And 输入租客名称"<tenantName>"
    And 合同选择房源"<building>"
    Then 检查关键词是否显示"<keyword>"

    Examples:
      | keyword | tenantName  | building |
      | fds     | 杭州娃哈哈饮料有限公司 | 测试审核流程   |

  @MAR-9032
  Scenario Outline: 删除租赁合同关键词
    Given 用户登录
    When 进入租赁合同关键词页面"<building>"
    Then 删除关键词"<keyword>"
    And 检查关键词是否显示"<keyword>"

    Examples:
      | building | keyword |
      | 测试审核流程   | fds     |

  @MAR-9038
  Scenario Outline: 新增物业合同添加关键词并在内部管理检查
    Given 用户登录
    And 进入物业合同页面
    And 点击新建合同按钮
    And 输入租客名称"<tenantName>"
    And 合同选择房源"<building>"
    And 新增一个关键词"<keyword>"
    And 点击下一步
    Then 补充押金、生成物业费明细 "<deposit>"
    And 保存并且新建成功
    And 进入物业合同关键词页面"<building>"
    And 检查该楼宇下的关键词"<keyword>"

    Examples:
      | tenantName  | building | deposit | keyword |
      | 杭州娃哈哈饮料有限公司 | 测试审核流程   | 300     | hsjk    |

  @MAR-9056
  Scenario Outline: 设置关键词不显示在物业合同查看
    Given 用户登录
    When 进入物业合同关键词页面"<building>"
    And 不显示关键词"<keyword>"
    And 返回内部管理主页面
    And 进入物业合同页面
    And 点击新建合同按钮
    And 输入租客名称"<tenantName>"
    And 合同选择房源"<building>"
    Then 检查关键词是否显示"<keyword>"

    Examples:
      | keyword | tenantName  | building |
      | hsjk    | 杭州娃哈哈饮料有限公司 | 测试审核流程   |

  @MAR-9057
  Scenario Outline: 删除物业合同关键词
    Given 用户登录
    When 进入物业合同关键词页面"<building>"
    Then 删除关键词"<keyword>"
    And 检查关键词是否显示"<keyword>"

    Examples:
      | building | keyword |
      | 测试审核流程   | hsjk    |

  @MAR-4935
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

  @MAR-5517
  Scenario Outline: 编辑售方信息
    Given 用户登录
    And 用户进入开票设置
    When 进入售方信息
    And 点击编辑按钮，更改信息 "<sname>"
    Then 售方信息名称被更改 "<sname>"

    Examples:
      | sname |
      | 黄金进口  |

  @MAR-9063
  Scenario Outline: 删除售方信息
    Given 用户登录
    And 用户进入开票设置
    When 进入售方信息
    And 点击删除按钮"<sname>"
    Then 确认删除

    Examples:
      | sname |
      | 黄金进口  |

  @MAR-4938
  Scenario Outline: 货物名称新建
    Given 用户登录
    And 用户进入开票设置
    When 进入货物名称
    And 点击“+信息”按钮，选择自建
    And 填写了货物信息并提交 "<gname>","<number>","<tax>"

    Examples:
      | gname | number              | tax  |
      | 棒棒糖   | 1234561232121212121 | 0.17 |

  @MAR-9076
  Scenario Outline: 编辑货物名称
    Given 用户登录
    And 用户进入开票设置
    When 进入货物名称
    And 点击编辑按钮，更改货物名称信息 "<sname>"
    Then 货物名称被更改 "<sname>"

    Examples:
      | sname |
      | 佛手柑   |

  Scenario Outline: 删除货物名称
    Given 用户登录
    And 用户进入开票设置
    When 进入货物名称
    And 点击货物名称删除按钮"<sname>"
    Then 删除货物名称"<sname>"

    Examples:
      | sname |
      | 佛手柑   |

  Scenario Outline: : 新增房源标签
    Given 用户登录
    And 用户拥有标签管理权限用户进入自定义管理里房源标签管理页面
    When 新增一个房源标签列表中并不存在的标签"<RoomTag>"
    Then 删除该房源"<RoomTag>"的标签

    Examples:
      | RoomTag  |
      | 独一无二的Tag |

  Scenario Outline: 给某房源打上标签
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    When 点击房源编辑按钮
    When 点选未高亮标签字段"<RoomTag>",该标签字段为选中状态
    And 保存
    Then 在房源信息页面看看是否有该标签"<RoomTag>"
    And 点击房源编辑按钮
    And 进入编辑房源界面取消标签高亮"<RoomTag>"
    And 保存

    Examples:
      | RoomTag     | roomNum |
      | 不能删用来点亮的tag | 哈哈      |

  Scenario Outline: 给某房源去掉标签
    Given 用户登录
    And 已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    When 点击房源编辑按钮
    When 点选未高亮标签字段"<RoomTag>",该标签字段为选中状态
    And 保存
    And 点击房源编辑按钮
    And 进入编辑房源界面取消标签高亮"<RoomTag>"
    And 保存
    Then 检查房源标签是否被取消"<RoomTag>"

    Examples:
      | RoomTag     | roomNum |
      | 不能删用来点亮的tag | 哈哈      |

  Scenario Outline: 新增行业
    Given 用户登录
    And 有行业编辑权限的用户进入自定义管理里的行业管理界面
    When 添加一个行业列表中并不存在的行业名称"<JobName>"
    Then 删除该行业名称"<JobName>"

    Examples:
      | JobName |
      | 独一无二的职业 |

  Scenario Outline: 新增行业重复
    Given 用户登录
    And 有行业编辑权限的用户进入自定义管理里的行业管理界面
    When 添加一个行业列表中已存在的行业名称"<JobName>"
    Then 报错提示，“行业名称重复”

    Examples:
      | JobName  |
      | 不删固定重复行业 |

  Scenario Outline: 在“行业”输入框输入不在列表内的行业（新建租赁合同部分）
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前租赁合同信息无合同存在
    When 用户点击新增租赁合同，输入租客名"<myCustomer>"并且在“所属行业”的输入框中输入行业列表中不存在的行业名称"<NotExistJob>"
    Then 行业输入框报错提示
    And 不能进入下一步

    Examples:
      | NotExistJob | roomNum | myCustomer |
      | 不存在的行业      | 不存在行业   | 小红         |

  Scenario Outline: 新增退租原因
    Given 用户登录
    And 进入内部管理页面
    When 进入退租原因管理页面
    And 新增退租原因"<reason>"
    Then 退租原因在列表中保存"<reason>"

    Examples:
      | reason |
      | 非正常退租  |

  Scenario Outline: 退租合同选择退租原因
    Given 用户登录
    And 在租赁合同页面
    When 点击新增租赁合同按钮
    And 输入租客"<tenantName>"
    And 合同选择房源"<building>"
    And 补充押金、基础单价、生成租金明细 "<deposit>""<price>"
    And 保存并且新建成功
    Then 对这份合同进行退租
    And 选择退租原因"<reason>"
    And 审核通过之后查看退租协议的退租原因是否一致"<reason>"

    Examples:
      | tenantName  | building | deposit | price | reason |
      | 杭州娃哈哈饮料有限公司 | 测试审核流程   | 300     | 30    | 非正常退租  |

  Scenario Outline: 删除退租原因
    Given 用户登录
    And 进入内部管理页面
    When 进入退租原因管理页面
    And 删除退租原因"<reason>"
    Then 退租原因在列表中删除"<reason>"

    Examples:
      | reason |
      | 非正常退租  |

  Scenario Outline: 新增费用类型
    Given 用户登录
    And 进入内部管理
    When 进入费用类型管理页面
    And 新增费用类型"<billType>"
    Then 费用类型在列表中保存"<billType>"

    Examples:
      | billType |
      | 火山口      |

  Scenario Outline: 新建账单选择费用类型
    Given 用户登录
    Given 用户登录
    And 用户进入新建收款账单弹框
    When 全部填写收款账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    Then 出现对应用户的未结清付款账单"<payer>"
    And 删除账单

    Examples:
      | type | starttime  | finishtime | amount | time       | payer | building  |
      | 火山口  | 2017-09-15 | 2017-11-01 | 8383   | 2017-12-15 | 用户    | 招商需求专用测试楼 |

  Scenario Outline: 删除费用类型
    Given 用户登录
    And 进入内部管理
    When 进入费用类型管理页面
    And 删除费用类型"<billType>"
    Then 费用类型在列表中删除"<billType>"

    Examples:
      | billType |
      | 火山口      |

  Scenario Outline: 新增租客标签
    Given 用户登录
    And 进入内部管理
    When 进入租客标签页面
    And 新增一个租客标签"<label>"
    Then 租客标签保存在列表中"<label>"

    Examples:
      | label |
      | ffgr  |


  Scenario Outline: 编辑租客标签
    Given 用户登录
    And 进入内部管理页面
    When 进入租客标签页面
    And 编辑租客标签"<label>"
    Then 租客标签信息被更改"<label>"

    Examples:
      | label |
      | ffgr  |

  Scenario Outline: 删除租客标签
    Given 用户登录
    And 进入内部管理页面
    When 进入租客标签页面
    And 新增一个租客标签"<label>"
    Then 租客标签保存在列表中"<label>"

    Examples:
      | label |
      | ffgr  |

  @MAR-10668 @mycheng   @CreamsWebSettingsTest
  Scenario Outline: 新增租赁合同模板
    Given 用户登录
    And 进入内部管理页面
    And 在租赁合同模板页面
    When 输入合同模板名称"<templatename>"
    And 上传合同模板
    Then 保存合同模板
    And 合同模板在列表中存在"<templatename>"

    Examples:
      | templatename |
      | 合同模板测试       |

  @MAR-11158 @mycheng   @CreamsWebSettingsTest
  Scenario Outline: 打印租赁合同模板
    Given 用户登录
    And 在租赁页面
    When 在列表中选择某一合同进入详情页
    And 点击打印
    Then 选择合同模板进行打印"<templatename>"
    And 打印成功

    Examples:
      | templatename |
      | 合同模板测试       |

  @MAR-11174 @mycheng   @CreamsWebSettingsTest
  Scenario Outline: 删除租赁合同模板
    Given 用户登录
    And 进入内部管理页面
    When 在租赁合同模板页面
    And 点击删除模板按钮"<templatename>"
    Then 合同模板删除成功"<templatename>"

    Examples:
      | templatename |
      | 合同模板测试       |


  @MAR-11176 @mycheng  @CreamsWebSettingsTest
  Scenario Outline: 新增物业合同模板
    Given 用户登录
    And 进入内部管理页面
    And 在物业合同模板页面
    When 输入物业合同模板名称"<templatename>"
    And 上传合同模板
    Then 保存合同模板
    And 合同模板在列表中存在"<templatename>"

    Examples:
      | templatename |
      | 物业合同模板测试     |

  @MAR-11178 @mycheng   @CreamsWebSettingsTest
  Scenario Outline: 打印物业合同模板
    Given 用户登录
    And 在物业合同页面
    When 在列表中选择某一合同进入详情页
    And 点击打印
    Then 选择合同模板进行打印"<templatename>"
    And 打印成功

    Examples:
      | templatename |
      | 物业合同模板测试     |

  @MAR-11186 @mycheng   @CreamsWebSettingsTest
  Scenario Outline: 删除物业合同模板
    Given 用户登录
    And 进入内部管理页面
    When 在物业合同模板页面
    And 点击删除模板按钮"<templatename>"
    Then 合同模板删除成功"<templatename>"

    Examples:
      | templatename |
      | 物业合同模板测试     |


  @MAR-11187 @mycheng   @CreamsWebSettingsTest @1
  Scenario Outline: 新增通知单模板
    Given 用户登录
    And 进入内部管理页面
    And 在通知单模板页面
    When 输入通知单名称"<templatename>"
    And 上传通知单模板
    Then 保存合同模板
    And 合同模板在列表中存在"<templatename>"

    Examples:
      | templatename |
      | 通知单模板测试      |

  @MAR-11188 @mycheng   @CreamsWebSettingsTest @1
  Scenario Outline: 打印通知单模板
    Given 用户登录
    And 进入收付款账单页面
    And 筛选账单为收款且未结清
    When 选中某一账单
    And 选择通知单催缴"<templatename>"
    Then 催缴单生成成功"<templatename>"

    Examples:
      | templatename |
      | 通知单模板测试      |

  @MAR-11211 @mycheng   @CreamsWebSettingsTest @1
  Scenario Outline: 删除通知单模板
    Given 用户登录
    And 进入内部管理页面
    When 在通知单模板页面
    And 点击删除模板按钮"<templatename>"
    Then 合同模板删除成功"<templatename>"

    Examples:
      | templatename |
      | 通知单模板测试      |

  Scenario Outline: 新建流水账户
    Given 用户登录
    And 进入内部管理页面
    When 在流水账户页面
    And 新建流水账户"<name>""<building>"
    Then 保存流水账户

    Examples:
      | name | building |
      | 法国红酒 | 覆盖       |

  Scenario Outline: 新建收支流水选择流水账户
    Given 用户登录
    And 用户点击收付款
    When 用户进入收支流水列表
    And 点击新建收支流水
    And 输入发生额、入账时间、对方单位名称 "<iamount>""<itime>""<iname>"
    And 选择流水账户"<name>"
    Then 点击保存，新建流水成功
    And 收支流水详情页中存在该收支流水"<name>"

    Examples:
      | iamount | itime      | iname | name |
      | 1000    | 2017-09-09 | lala  | 法国红酒 |

  Scenario Outline: 编辑流水账户
    Given 用户登录
    And 进入内部管理页面
    When 在流水账户页面
    And 编辑流水账户"<name>""<building>"
    Then 保存流水账户

    Examples:
      | name | building |
      | 红酒   | 覆盖是      |

  Scenario Outline: 删除流水账户
    Given 用户登录
    And 进入内部管理页面
    When 在流水账户页面
    And 删除流水账户"<name>"
    Then 列表中改流水账户不存在"<name>"

    Examples:
      | name |
      | 红酒   |

  @MAR-5426 @AcceptenceTest @CreamsWebSettingsTest @mycheng
  Scenario Outline: 新增行业
    Given 用户登录
    And 有行业编辑权限的用户进入自定义管理里的行业管理界面
    When 添加一个行业列表中并不存在的行业名称"<JobName>"
    Then 删除该行业名称"<JobName>"

    Examples:
      | JobName |
      | 独一无二的职业 |

  @MAR-5428 @AcceptenceTest @CreamsWebSettingsTest @mycheng
  Scenario Outline: 新增行业重复
    Given 用户登录
    And 有行业编辑权限的用户进入自定义管理里的行业管理界面
    When 添加一个行业列表中已存在的行业名称"<JobName>"
    Then 报错提示，“行业名称重复”

    Examples:
      | JobName  |
      | 不删固定重复行业 |

  @MAR-5433 @AcceptenceTest @CreamsWebSettingsTest @mycheng
  Scenario Outline: 在“行业”输入框输入不在列表内的行业（新建租赁合同部分）
    Given 用户登录
    And 已进入剖面图房源"<roomNum>"侧滑栏页面，当前租赁合同信息无合同存在
    When 用户点击新增租赁合同，输入租客名"<myCustomer>"并且在“所属行业”的输入框中输入行业列表中不存在的行业名称"<NotExistJob>"
    Then 行业输入框报错提示
    And 不能进入下一步

    Examples:
      | NotExistJob | roomNum | myCustomer |
      | 不存在的行业      | 不存在行业   | 小红         |

  @MAR-11452 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 新增费用类型
    Given 用户登录
    And 进入内部管理页面
    When 进入费用类型管理页面
    And 新增费用类型"<billtype>"
    Then 费用类型新增成功"<billtype>"

    Examples:
      | billtype |
      | 测试费用类型   |

  @MAR-11458 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 新建账单选择新建的费用类型
    Given 用户登录
    And 用户进入新建收款账单弹框
    When 全部填写收款账单信息，勾选房源信息 "<type>" "<starttime>" "<finishtime>" "<amount>" "<time>" "<payer>" "<building>"
    And 提交账单
    And 清除筛选条件
    Then 新费用类型账单新建成功 "<type>"
    And 点击删除账单按钮
    And  点击确认删除

    Examples:
      | type   | starttime  | finishtime | amount | time       | payer | building  |
      | 测试费用类型 | 2017-09-15 | 2017-11-01 | 8383   | 2017-12-15 | 用户    | 招商需求专用测试楼 |


  @MAR-11460 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 删除费用类型
    Given 用户登录
    And 进入内部管理页面
    When 进入费用类型管理页面
    And 选择费用类型并删除"<billtype>"
    Then 费用类型删除成功"<billtype>"


    Examples:
      | billtype |
      | 测试费用类型   |

  @MAR-11724 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 新增租客标签
    Given 用户登录
    And 进入内部管理页面
    When 进入租客标签管理页面
    And 新增租客标签 "<label>"
    Then 租客标签新建成功 "<label>"


    Examples:
      | label  |
      | 租客标签测试 |

  @MAR-8727 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 租客新建，客户标签
    Given 用户登录
    And 进入租客管理页面
    When 点击新建租客按钮
    Then 输入租客名称  "<tenant>"，并选择联想租客 "<tenantName>"
    And 点击标签"<label>"
    And 保存租客
    And 清除租客状态选项
    And 新建的租客标签显示正确"<label>"
    And 进入租客 "<tenantName>"的详情页
    And 删除租客

    Examples:
      | tenant | tenantName  | label  |
      | 娃哈哈    | 杭州娃哈哈集团有限公司 | 租客标签测试 |


  @MAR-11727 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 编辑租客标签
    Given 用户登录
    And 进入内部管理页面
    And 进入租客标签管理页面
    When 编辑租客标签"<labelname>","<label>"
    Then 租客标签新建成功 "<label>"

    Examples:
      | labelname | label   |
      | 租客标签测试    | 租客标签测试2 |


  @MAR-11731 @mycheng  @AcceptenceTest @CreamsWebSettingsTest
  Scenario Outline: 删除租客标签
    Given 用户登录
    And 进入内部管理页面
    And 进入租客标签管理页面
    When 删除租客标签"<label>"
    Then 租客标签删除成功"<label>"


    Examples:
      | label   |
      | 租客标签测试2 |