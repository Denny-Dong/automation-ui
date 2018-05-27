@KOOP-1689
Feature: 联系招商部
	As a user
	I want to contact business department

@CreamsIOSTesting @KOOP-1720
Scenario Outline: 未登录用户进入楼盘详情，点击联系招商部
Given 已成功进入房源列表
When 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
And 点击列表中的楼盘 "<楼盘>"
And 进入楼盘详情，楼盘 "<楼盘>"显示正确
When 点击联系招商部
Then 跳转到登录页面
And 用户登录成功后回到楼盘详情页面 "<用户名>" "<密码>"

Examples:
    | 城市 |  搜索条件 |   楼盘     |   用户名   |   密码  |
    | 杭州市 |  王道 | 王道公园自动化测试楼 |18158885555 | 111111|


@CreamsIOSTesting @KOOP-979 @KOOP-1118
Scenario Outline: 已登录用户进入楼盘详情，点击联系招商部
Given 用户 "<用户名>" "<密码>" 登录成功
When 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
And 点击列表中的楼盘 "<楼盘>"
And 进入楼盘详情，楼盘 "<楼盘>"显示正确
When 点击联系招商部
And 进入联系招商部页面
Then 页面上信息显示正确 "<公司名称>" "<面积>"
And 电话个数 "<电话个数>" 正确



Examples:
	| 城市 |    用户名   |    密码    | 搜索条件 |  楼盘   | 公司名称 |           面积           |电话个数|
	| 杭州市 |18158885555 | 111111 |  王道   | 王道公园自动化测试楼 |  测试专用   |  500㎡ \| 600㎡  |  2   |
