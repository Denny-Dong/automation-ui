@MAR-4088
Feature: 楼宇管理
  为了能使用creams网页的主要功能
  作为网页的使用者
  I want

  @MAR-860 @CreamsWebBuildingTest @xywu
  Scenario Outline: 新建楼宇
    Given 用户登录
    And 用户进入楼宇管理列表页
    When 点击右侧新建楼宇
    Then 弹框出现楼宇新建的详细信息页面 "<province>" "<city>" "<region>" "<name>" "<address>" "<promotionTel>" "<alertDaysNum>" "<ContractNo>"
    And 新建楼宇成功，下方楼宇列表和左边楼宇集合出现一条新楼宇数据"<name>"

    Examples: 
      | province | city | region | name | address | promotionTel | alertDaysNum | ContractNo |
      | 浙江省      | 杭州市  | 滨江区    | 测试大楼 | 怀德街南门   |      8200222 |           10 |     123456 |

  @MAR-912 @AcceptenceTest @CreamsWebBuildingTest @xywu
  Scenario: 新建楼宇第一页必填项填完后才能下一步
    Given 用户登录
    And 用户进入楼宇管理列表页
    And 点击右侧新建楼宇
    And 信息没有填写完全
    When 下一步
    Then 提示必须填全

  @MAR-924 @AcceptenceTest @CreamsWebBuildingTest @xywu
  Scenario Outline: 楼层编辑多层楼层的添加
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    When 选择添加楼层数量为多层
    And 起始楼层为"<begin>"、结束楼层为"<end>"、
    And 点击了添加楼层按钮
    Then 下方楼层列表数据刷新，在顶部增加了楼层名为"<begin>"，、房源数量为0的一条楼层数据

    Examples: 
      | building | begin | end |
      | 测试楼      |     2 |   6 |

  @MAR-926 @AcceptenceTest @CreamsWebBuildingTest @xywu
  Scenario Outline: 删除0房源楼层
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    And 新建一个房源个数为零的楼层"<floor>"
    When 点击删除这个新建的楼层"<floor>"
    Then 提示“您确定要删除该楼层”
    And 删除这个楼层

    Examples: 
      | building | floor |
      | 测试楼      | 0房源   |

  #prd和rc版本不同，先不跑
  @MAR-927 @CreamsWebBuildingTest @xywu
  Scenario Outline: 删除有房源的楼层
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    And 新建一个房源个数为零的楼层"<floor>"
    And 点击楼层编辑页面的保存按钮
    And 用户进入选择新增窗口
    And 填写完整所有必填项（楼层、房号、招商状态）"<floor>" "<roomNum>" "<roomArea>" "<merchantsState>"
    And 点击了保存并提交
    And 从房源管理页面进入楼层编辑页面"<building>"
    When 点击删除这个新建的楼层"<floor>"
    Then 提示“您删除的楼层存在房源，可能与需求和合同有关联，确定要删除该楼层。”
    And 删除这个楼层

    Examples: 
      | building | floor | roomNum | roomArea | merchantsState |
      | 测试楼      | 有房源   |     101 |      100 | 不可招商           |

  @MAR-928 @AcceptenceTest @CreamsWebBuildingTest @xywu
  Scenario Outline: 楼层更改
    Given 用户登录
    And 进入楼层编辑页面"<building>"
    And 选择添加楼层数量为多层
    And 起始楼层为"<begin>"、结束楼层为"<end>"、
    And 点击了添加楼层按钮
    When 点击列表中楼层名为"<end>"的楼层左侧拖拽按钮上移动到楼层名为"<begin>"的楼层上部
    Then 楼层列表第一层变为"<end>"

    Examples: 
      | building | begin | end |
      | 测试楼      |     2 |   6 |
