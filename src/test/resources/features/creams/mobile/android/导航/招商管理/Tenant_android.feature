@MAR-4986
Feature: 租客联系人
  I want to use this template for 测试租客联系人的相关功能

  @CreamsAPPAndroid  @wangshengwei
  Scenario Outline: 新建租客联系人，填写全部信息
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击导航进入导航页
    And 点击客户管理进入客户管理列表
    And 点击客户管理右上角的添加按钮
    And 点击租客联系人显示框进入租客联系人搜索框页
    When 点击租客联系人搜索页的新建按钮
    And 输入租客的姓名 "<姓名>"
    And 输入租客的电话 "<电话>"
    And 输入租客的公司 "<公司>"
    And 输入租客的邮箱 "<租客邮箱>"
    And 输入租客的通讯地址 "<通讯地址>"
    And 点击新建租客联系人页面的保存按钮
    Then 租客联系人搜索框页上存在一个姓名和公司为 "<姓名和公司>"的租客,租客新建成功
    And 电话和邮箱显示正确 "<姓名和公司>" "<电话和邮箱>"

    Examples:
    |         邮箱       |   密码  |    姓名   |    电话      |    公司   |       租客邮箱      |    通讯地址     |          姓名和公司       |            电话和邮箱          |
    |xypeng@91souban.com|Pexy6666 |auto客户联系人| 18158885552 |auto租客公司|silence@sina.com| auto租客通讯地址  |auto客户联系人，auto租客公司|18158885552 / silence@sina.com|



  @CreamsAPPAndroid  @MAR-2249 @MAR-2219  @MAR-2256 @wangshengwei
  Scenario Outline: 新建租客联系人，填写必填项
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击导航进入导航页
    And 点击客户管理进入客户管理列表
    And 点击客户管理右上角的添加按钮
    And 点击租客联系人显示框进入租客联系人搜索框页
    When 点击租客联系人搜索页的新建按钮
    And 输入租客的姓名 "<姓名>"
    And 输入租客的电话 "<电话>"
    And 点击新建租客联系人页面的保存按钮
    Then 租客联系人搜索框页上存在一个姓名和公司为 "<姓名>"的租客,租客新建成功
    And 电话和邮箱显示正确 "<姓名>" "<电话>"



    Examples:
      |         邮箱       |   密码   |    姓名   |    电话      |
      |xypeng@91souban.com |Pexy6666 |auto租客联系人| 18158885551|