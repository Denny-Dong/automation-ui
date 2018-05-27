@MAR-4984
Feature: 全局搜索

  @CreamsAPPIOS2 @MAR-2122 @pengxingyue
  Scenario Outline: 房源搜索
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    When 点击搜索
    And 输入房号 "<房号>"
    Then 列表包含搜索的房号的房源 "<房号>"
    And 房源 "<房号>"信息 "<预租单价和面积>" "<状态>"显示正确

    Examples: 
      | 邮箱                 | 密码      | 楼宇             | 房号  | 预租单价和面积       | 状态  |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 666 | ￥6元/m²·天 @ 666m² | 不可招商 |

  @CreamsAPPIOS2@MAR-2136 @pengxingyue
  Scenario Outline: 租赁合同搜索
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    When 点击搜索
    And 点击租赁合同
    And 输入租客"<租客>"
    Then 列表包含所搜索租客的租赁合同"<租客全名>"
    And 合同信息"<租客全名>""<房号>""<面积>""<基础单价>""<合同计租日>""<合同结束日>"显示正确

    Examples: 
      | 邮箱                 | 密码      | 楼宇             | 租客    | 租客全名                    | 房号  | 面积     | 基础单价   | 合同计租日   | 合同结束日  |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | 正常执行 | 正常执行 @ 自动化测试（不要动） | 607 | 217.54m² | 3元/m²·天 | 2018/02/27 |2019/02/26 |

  @CreamsAPPIOS2 @MAR-2131 @pengxingyue
  Scenario Outline: 客户搜索
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    When 点击搜索
    And 点击客户
    And 输入客户名称"<客户名称>"
    Then 列表包含所搜索的客户名称的客户"<客户>"
    And 客户"<客户>"信息"<租客状态>""<租赁顾问>""<来访时间>""<需求面积段>""<渠道>""<意向房源>""<最新备注>"显示正确

    Examples: 
      | 邮箱                 | 密码      | 楼宇             |  客户名称    | 客户        | 租客状态 | 租赁顾问 | 来访时间    | 需求面积段   | 渠道     | 意向房源                           | 最新备注 |
      | xypeng@91souban.com | Pexy6666 | 自动化测试（不要动） | auto客户搜索 | auto客户搜索 | 初次接触 | 小破孩  | 2018/02/25 | 300-400m² | 公司经纪人 | 自动化测试（不要动）（1房源 \| 333m²） | 暂无   |
