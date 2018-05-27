@KOOP-1697
Feature: 进入楼宇详情，报错
	I want to 进入楼宇详情，报错

@GoToBuildingGroupDetail
Scenario Outline: 进入楼宇详情
Given 已成功进入房源列表
When 点击楼盘 "<楼盘>"
Then 进入楼盘详情，楼盘 "<楼盘>"显示正确

Examples:

		|      楼盘     |
    | 西湖国际科技大厦 |

@CreamsAndroidTesting @KOOP-1107
Scenario Outline: 用户未登录报错，选择报错原因不需要手动输入的
Given 已成功进入房源列表
And 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
And 点击列表中的楼盘 "<楼盘>"
And 进入楼盘详情，楼盘 "<楼盘>"显示正确
When 点击报错
And 点击选择报错原因
And 点击提交报错
Then 报错成功

Examples:

		| 城市|搜索条件|   楼盘  |
     |杭州市| 王道  | 王道公园自动化测试楼 |
    
    
    
@CreamsAndroidTesting @KOOP-1722
Scenario Outline: 用户未登录报错，选择报错原因4,需要手动输入报错原因
Given 已成功进入房源列表
And 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
And 点击列表中的楼盘 "<楼盘>"
And 进入楼盘详情，楼盘 "<楼盘>"显示正确
When 点击报错
And 点击选择报错原因并输入报错原因 "<报错原因>"
And 点击提交报错
Then 报错成功

Examples:

			 |城市|搜索条件 |  楼盘   |   报错原因  |
       |杭州市|   王道 | 王道公园自动化测试楼 |auto报错原因3|
       
@CreamsAndroidTesting @KOOP-1107
Scenario Outline: 用户登录报错，选择报错原因不需要手动输入的
Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
And 返回房源列表
And 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
And 点击列表中的楼盘 "<楼盘>"
And 进入楼盘详情，楼盘 "<楼盘>"显示正确
When 点击报错
And 点击选择报错原因
And 点击提交报错
Then 报错成功

Examples:

		 | 城市|搜索条件|        楼盘       |    用户名   |  密码 |
     |杭州市| 王道  | 王道公园自动化测试楼 |18158885555 |111111|
     
     
  
 @CreamsAndroidTesting @KOOP-1722
 Scenario Outline: 用户未登录报错，选择报错原因4,需要手动输入报错原因
 Given 输入用户名 "<用户名>" 和 密码 "<密码>"成功登录CreamsAgentApp
 And 返回房源列表
 And 选择城市 "<城市>"后通过搜索输入搜索条件 "<搜索条件>" 筛选出楼盘 "<楼盘>"
 And 点击列表中的楼盘 "<楼盘>"
 And 进入楼盘详情，楼盘 "<楼盘>"显示正确
 When 点击报错
 And 点击选择报错原因并输入报错原因 "<报错原因>"
 And 点击提交报错
 Then 报错成功

 Examples:

			 |城市|搜索条件 |  楼盘   |   报错原因  |用户名|密码|
       |杭州市|   王道 | 王道公园自动化测试楼 |auto报错原因3|18158885555|111111|