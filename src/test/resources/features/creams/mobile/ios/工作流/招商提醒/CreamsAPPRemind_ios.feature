@MAR-4986
Feature: 招商提醒
  I want to use this template for 测试招商提醒的相关功能


  @CreamsAPPIOS @wangshengwei
  Scenario Outline: 新建提醒
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击导航进入导航页
    And 点击客户管理进入客户管理列表
    When 点击客户管理页面顶部的搜索框进入搜索页
    And 在搜索框中输入客户姓名关键词 "<客户姓名>"
    And 点击客户姓名为客户姓名为 "<客户姓名>"的记录，进入客户详情页
    And 点击客户详情页上的操作按钮
    And 点击操作列表中的提醒按钮
    And 点击新增提醒按钮
    And 选择提醒时间和输入提醒内容 "<提醒内容>"
    And 点击新建提醒页面的保存按钮
    Then 提醒列表中存在一条提醒内容为 "<提醒内容>"的提醒，提醒新建成功

    Examples:
      | 邮箱                | 密码     |   客户姓名   | 提醒内容|
      | xypeng@91souban.com|Pexy6666  | auto客户自动化测试 | auto工作流提醒|


  @CreamsAPPIOS @wangshengwei
  Scenario Outline: 新建招商提醒后查看工作流
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    When 点击工作流进入工作流页
    And 选择招商提醒进入招商提醒页
    And 点击待办事项进入待办事项列表
    Then 待办事项列表中存在一条客户名称为 "<客户名称>"的提醒
    And ios招商提醒的内容和按钮类型显示正确 "<客户名称>" "<完成>" "<楼宇名称>" "<提醒摘要>"

    Examples:
      | 邮箱                  | 密码       |      客户名称     |楼宇名称|     提醒摘要    |完成|
      | xypeng@91souban.com  |  Pexy6666  | auto客户自动化测试 |自动化测试（不要动）|auto工作流提醒|完成|


  @CreamsAPPIOS @wangshengwei
  Scenario Outline: 招商提醒点击完成,查看已完事项列表
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击工作流进入工作流页
    And 选择招商提醒进入招商提醒页
    And 点击待办事项进入待办事项列表
    When 点击客户名称为 "<客户名称>"的提醒的完成按钮
    And 点击确定要标记为"已完成"吗的确定按钮
    Then 待办事项列表中不存在一条客户名称为 "<客户名称>"的提醒
    And 点击已完事项进入已完事项列表
    And 已完事项列表中存在一条客户名称为 "<客户名称>"的提醒
    And IOS招商提醒的内容显示正确 "<客户名称>" "<楼宇名称>"  "<提醒摘要>"
    And 招商提醒列表中存在删除按钮

    Examples:
      | 邮箱                 | 密码     |    提醒摘要    |     客户名称    |     楼宇名称     |
      | xypeng@91souban.com | Pexy6666 | auto工作流提醒 |auto客户自动化测试|自动化测试（不要动）|


  @CreamsAPPIOS @wangshengwei
  Scenario Outline: 招商提醒已完事项,点击删除
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击工作流进入工作流页
    And 选择招商提醒进入招商提醒页
    And 点击已完事项进入已完事项列表
    When 点击客户名称为 "<客户名称>"的提醒的删除按钮
    And 点击确定要删除该条提醒吗的确定按钮
    Then 已完事项列表中不存在一条客户名称为 "<客户名称>"的提醒，提醒删除成功

    Examples:
      | 邮箱                  | 密码     | 客户名称|
      | xypeng@91souban.com | Pexy6666 | auto客户自动化测试|