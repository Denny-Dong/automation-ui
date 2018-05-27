@KOOP-1689
Feature: 进入房源列表
	I want to 运行经纪人app并进入房源列表

#@CreamsIOSTesting @KOOP-1213 @KOOP-1094
#Scenario Outline: 进入房源列表, 城市定位正确
#Given 已成功进入房源列表
#When 查看城市显示
#Then "<城市>"城市显示正确
#And 城市选择列表中定位城市显示 "<定位城市>"



#Examples:
    #| 城市 |定位城市|
    #| 杭州 | 杭州市 |


@CreamsIOSTesting @KOOP-1080 
Scenario Outline: 进入房源列表，搜索楼盘
Given 已成功进入房源列表
When 选择城市为 "<城市>"后点击搜索框进入搜索页面
And 输入搜索内容为已有的楼盘名称 "<楼盘名称>"
And 点击为您推荐列表的其中一个楼盘 "<楼盘>"
Then iOS搜索框填充的楼盘和搜索的楼盘 "<楼盘>" 一致
And 列表显示的楼盘和搜索的楼盘 "<楼盘>"一致
And ios列表中楼盘信息显示正确 "<租金>" "<租金单位>" "<区域>" "<在租户型>" "<房源推荐>"

Examples:
    | 城市 | 楼盘名称 |     楼盘           |  租金 | 租金单位 |     区域     |  在租户型 |   房源推荐  |
    | 杭州市 |  王道   |王道公园自动化测试楼 | 2~5 | 元/m²·天|滨江区-彩虹城商圈|2户型在租 | 4房源推荐 |
 
 
    
@CreamsIOSTesting
Scenario Outline: 进入房源列表，搜索楼盘
Given 已成功进入房源列表
When 点击城市进入城市选择列表
And 可选城市列表点击 "<城市>"
Then "<已选城市>" 选择成功

Examples:
    |  城市 | 已选城市 |
    | 杭州市 | 杭州 |    
    
#@gotobuildingdetail
#Scenario Outline: 进入楼宇详情
#Given iOS成功进入房源列表
#When 点击楼盘 "<楼盘>"
#Then 进入楼盘详情，楼盘 "<楼盘>"显示正确
#
#Examples:
#
#		|    楼盘    |
    #| 城市发展大厦 |