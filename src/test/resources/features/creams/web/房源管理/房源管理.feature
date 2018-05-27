@MAR-4088
Feature: 房源管理
  为了能使用creams网页的主要功能
  作为网页的使用者
  I want

  @MAR-799 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: portfolio下查看房源列表
    Given 用户登录
    And 目前集合选中AB俩个楼宇"<building1>" "<building2>"
    When 用户点击房源管理
    Then 显示筛选条件为楼宇"<building1>" "<building2>"
    And 下面的所有房源根据可招商、不可招商、所有、房源分析四个房源列表，默认展示可招商列表，列名： 楼层、房号、面积、装修、预租单价

    Examples:
      | building1 | building2 |
      | 测试楼       | 楼宇名称      |

  @MAR-804 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: portfolio下已租房源列表的显示
    Given 用户登录
    And 目前集合选中AB俩个楼宇"<building1>" "<building2>"
    And 用户点击房源管理
    When 点击了已租房源
    Then 列表列名切换成已租房源对应的列名：楼宇名称、楼层、房号、面积、租客、计租日、结束日、合同单价

    Examples:
      | building1 | building2 |
      | 测试楼       | 楼宇名称      |

  @MAR-803 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: portfolio下所有房源列表的显示
    Given 用户登录
    And 目前集合选中AB俩个楼宇"<building1>" "<building2>"
    And 用户点击房源管理
    When 点击了所有房源
    Then 列表列名切换成所有房源对应的列名：楼宇名称、楼层、房号、面积、租客、招商状态、计租日、结束日、合同单价

    Examples:
      | building1 | building2 |
      | 测试楼       | 楼宇名称      |

  @MAR-811
  Scenario Outline: 条件筛选
    Given 用户登录
    And 用户在集合的房源管理页面
    When 用户输入"<keyword>"进行搜索
    Then 根据列表出现包含"<keyword>"的房号的所有房源
    And 筛选条件中显示这一筛选

    Examples:
      | keyword |
      | 1       |

  @MAR-816 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 新增房源
    Given 用户登录
    And 用户在集合的房源管理页面
    When 用户点击新增房源功能
    Then 出现可以选择用户所有的楼宇列表的房源新增窗口

  @MAR-820 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 编辑房源
    Given 用户登录
    And 用户在集合的房源管理页面
    When 点击了鼠标hover
    And 点击编辑房源
    Then 出现该房源的编辑弹窗

  @MAR-822 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 房源管理新增合同
    Given 用户登录
    And 用户在集合的房源管理页面
    When 点击了鼠标hover
    And 点击新增合同
    Then 出现默认选中该房源的新增合同弹窗

  @MAR-853 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 单一楼宇房源列表
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    When 用户点击房源管理
    Then 下面的所有房源根据可招商、不可招商、所有、房源分析四个房源列表，默认展示可招商列表，列名： 楼层、房号、面积、装修、预租单价

    Examples:
      | building |
      | 测试楼      |

  @MAR-854 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 单一楼宇剖面图新增房源
    Given 用户登录
    And 用户在单一楼宇页面"<building>"
    And 用户点击房源管理
    When 用户点击新增房源功能
    Then 出现默认为当前楼宇且不能修改的房源新增窗口

    Examples:
      | building |
      | 测试楼      |

  @MAR-941 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 右侧栏1000px房源详情页的现实
    Given 用户登录
    And 用户点击房源管理
    When 用户点击某一条目
    Then 右侧栏划出房源详情页，展示楼层房号信息、面积、帐号状态、预租单价、装修、以及编辑按钮、删除按钮图标、历史操作按钮图标，合同列表、需求列表、物业合同列表，合同列表和物业物业合同列表都根据进行中和已完结可以切换

  @MAR-898 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 房源创建页面
    Given 用户登录
    And 用户在集合的房源管理页面
    When 用户点击新增房源功能
    Then 出现可以选择用户所有的楼宇列表的房源新增窗口


  @MAR-902 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 新增楼层再新增房源
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    And 新建一个房源个数为零的楼层"<floor>"
    And 点击楼层编辑页面的保存按钮
    And 用户进入选择新增窗口
    When 填写完整所有必填项（楼层、房号、招商状态）"<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 点击了保存并提交
    Then 新增了对应楼层房号的房源成功
    When 点击了鼠标hover
    And 点击编辑房源
    And 删除这个房源

    Examples:
      | building | floor | roomNum | roomArea | merchantsState |
      | 测试楼      | 有房源   | 101     | 100      | 可招商            |

  @MAR-904 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 选择装修
    Given 用户登录
    And 用户进入选择新增窗口
    When 点击了装修下拉箭头
    Then 出现毛坯 简装  精装 3个选项

  @MAR-905 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario: 选择招商状态
    Given 用户登录
    And 用户进入选择新增窗口
    When 点击了招商状态下拉箭头
    Then 出现可招商和不可招商两个选项

  @MAR-906 @@AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: : 房源编辑
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    And 新建一个房源个数为零的楼层"<floor>"
    And 点击楼层编辑页面的保存按钮
    And 用户进入选择新增窗口
    And 填写完整所有必填项（楼层、房号、招商状态）"<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 点击了保存并提交
    And 新增了对应楼层房号的房源成功
    When 点击了鼠标hover
    And 点击编辑房源
    And 房源编辑页面默认填充"<building>""<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 删除编辑的这个房源

    Examples:
      | building | floor | roomNum | roomArea | merchantsState |
      | 测试楼      | 有房源   | 101     | 100.00   | 可招商            |

  @MAR-4988 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: : 新增房源标签
    Given 用户登录
    And 用户拥有标签管理权限用户进入自定义管理里房源标签管理页面
    When 新增一个房源标签列表中并不存在的标签"<RoomTag>"
    Then 删除该房源"<RoomTag>"的标签

    Examples:
      | RoomTag  |
      | 独一无二的Tag |

  @MAR-4999 @AcceptenceTest @CreamsWebRoomTest @jyyang
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

  @MAR-5000 @AcceptenceTest @CreamsWebRoomTest @jyyang
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


  @MAR-902 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 新增房源
    Given 用户登录
    And 用户在集合的房源管理页面
    When 用户点击新增房源功能
    And   新增房源页选择楼宇"<building>"
    And   填写房源信息"<floor>"楼层、 "<roomNum>"房号、 "<area>"面积
    And   保存房源
    Then  弹出"<successMessage>"提示框，点击确认
    Examples:
      | building | floor | roomNum | area | successMessage |
      | wd测试楼    | 3     | 房源编辑页删除 | 123  | 新建成功           |


  @MAR-11593 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 编辑页删除房源操作
    Given 用户登录
    And   已进入剖面图房源侧滑栏页面,进入房源"<roomNum>"
    When  点击房源编辑按钮
    And   点击删除房源按钮
    And   弹出"<alertMessage>"提示确认框
    And   点击是
    Then  弹出"<successMessage>"提示框，点击确认

    Examples:
      | roomNum | alertMessage                          | successMessage |
      | 房源编辑页删除 | 删除房源后，相关合同、客户数据不会发生变化，请手动修改对应数据。确认删除？ | 该房源已删除         |


  @MAR-11610 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 在房源信息页面新增客户
    Given 用户登录
    And 用户在集合的房源管理页面
    When 选择"<building>"楼宇的"<roomNum>"房源
    And  点击新增客户
    And  输入客户信息"<renter>"，并保存客户
    Then  弹出"<successMessage>"提示框，点击确认

    Examples:
      | building | roomNum | renter | successMessage |
      | wd测试楼    | 测试客户    | 测试客户   | 新建成功           |

  @MAR-11870 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: 房源编辑，修改招商状态
    Given 用户登录
    And   用户在单一楼宇页面"<building>"
    And   用户点击房源管理
    And   选择所有房源
    When  选择"<roomNum>"房源,点击编辑房源按钮
    And   修改招商状态"<status>"
    And   保存房源
    Then  弹出"<successMessage>"提示框，点击确认
    And   房源的招商状态为"<status>"

    Examples:
      | building | roomNum | status | successMessage |
      | wd的楼2号   | 测试招商状态  | 不可招商   | 保存成功！          |
      | wd的楼2号   | 测试招商状态  | 可招商    | 保存成功！          |


  @MAR-11872 @AcceptenceTest @CreamsWebRoomTest @jyyang
  Scenario Outline: "可招商并已租的房源"，3个不同界面查看
    Given 用户登录
    And   用户在单一楼宇页面"<building>"
    And   用户点击房源管理
    When  在可招商列表
    Then   "<roomNum>"房源存在
    When   在已租房源列表
    Then   "<roomNum>"房源存在
    When  在所有房源列表
    Then   "<roomNum>"房源存在

    Examples:
      | building | roomNum |
      | wd的楼2号   | 测试招商状态  |