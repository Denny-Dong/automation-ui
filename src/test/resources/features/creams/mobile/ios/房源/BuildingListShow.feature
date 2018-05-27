@MAR-4984
Feature: 楼宇列表、房源列表、房源详情显示及编辑

@CreamsAPPIOS2 @MAR-2325	@lixueli
Scenario Outline: 选择单个楼宇，检查楼宇内容显示
Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
When 点击左上角入口进入楼宇侧滑栏
And 选择楼宇 "<楼宇>"
And 点击右侧空白处进入楼宇 "<楼宇>" 列表
Then 楼宇 "<楼宇>" 信息 "<地址>" "<总面积>" 显示正确

Examples:
     |        邮箱          | 密码       |       楼宇       |           地址           |  总面积   | 
     | xypeng@91souban.com | Xy666666  | 自动化测试（不要动） |   杭州市/建德市/不要动我的楼 | 3621.78m² |

     
@CreamsAPPIOS2 @MAR-2202 @MAR-2183 @lixueli
Scenario Outline: 点击楼宇进入房源列表，查看列表显示
Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
And 点击左上角入口进入楼宇侧滑栏
And 选择楼宇 "<楼宇>"
And 点击右侧空白处进入楼宇 "<楼宇>" 列表
When 点击楼宇 "<楼宇>" 进入房源列表
Then 显示可招商列表
And 房源 "<房源>" 的租赁状态 "<租赁状态>" 预租单价和面积 "<预租单价面积>" 装修 "<装修>" 显示正确
When 点击房源 "<房源>" 进入详情页
And 楼层房号 "<楼层房号>" 显示正确
And 房源所属楼宇信息 "<楼宇名称>" "<楼宇地址>" 显示正确
And 房源信息 "<面积>" "<招商状态>" "<预租单价>" "<装修风格>" 显示正确

Examples:
		| 邮箱                  | 密码       |       楼宇       | 房源 | 租赁状态 |      预租单价面积        | 装修 |  楼层房号  |     楼宇名称     |       楼宇地址     |    面积   | 招商状态 | 预租单价 | 装修风格 |
		| xypeng@91souban.com  | Xy666666  | 自动化测试（不要动） | 333 |   空置  | 预租￥ -元/m²·天 @ 333m² | 精装 | 3楼/333室 | 自动化测试（不要动）| 杭州市/建德市/不要动我的楼 | 333m² | 可招商 | - |  精装   |

		
@CreamsAPPIOS1 @MAR-5054 @lixueli
Scenario Outline: 编辑房源
Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
And 点击左上角入口进入楼宇侧滑栏
And 选择楼宇 "<楼宇>"
And 点击右侧空白处进入楼宇 "<楼宇>" 列表
When 点击楼宇 "<楼宇>" 进入房源列表
And 点击房源 "<房源>" 进入详情页
And 点击编辑房源按钮进入编辑页面
And 修改面积为 "<修改后的面积>"
And 修改装修风格为 "<修改后的装修>"
And 修改预租单价为 "<修改后的预租单价>"
And 修改价格单位为 "<修改后的价格单位>"
And 点击保存房源编辑
Then 房源信息修改成功，显示为修改后的 "<改过的面积>" "<招商状态>" "<修改后的单价>" "<修改后的装修>" 
And 点击返回回到房源列表
And 列表中房源 "<房源>" 的信息也更新为修改后的 "<租赁状态>" "<修改后的单价面积>" "<修改后的装修>" 
# 房源信息重新修改回去
And 点击房源 "<房源>" 进入详情页
And 点击编辑房源按钮进入编辑页面
And 修改面积为 "<原来的面积>"
And 修改装修风格为 "<原来的装修>"
And 修改预租单价为 "<原来的预租单价>"
And 修改价格单位为 "<原来的价格单位>"
And 点击保存房源编辑
Then 房源信息修改成功，显示为修改后的 "<原面积>" "<招商状态>" "<原来的单价>" "<原来的装修>" 
And 点击返回回到房源列表
And 列表中房源 "<房源>" 的信息也更新为修改后的 "<租赁状态>" "<原来的单价面积>" "<原来的装修>"

Examples:
		| 邮箱                  | 密码       |       楼宇       | 房源 | 修改后的面积 | 修改后的装修 | 修改后的预租单价 | 修改后的价格单位 | 改过的面积 | 招商状态 | 修改后的单价 |      修改后的单价面积      | 租赁状态 | 原来的面积 | 原来的装修 | 原来的预租单价 | 原来的价格单位| 原面积 |  原来的单价  |        原来的单价面积    |
		|xypeng@91souban.com   | Xy666666  | 自动化测试（不要动） | 333 |    888     |    简装    |       88      |   元/m²·月   |   888m²   |  可招商  | 88元/m²·月 | 预租￥88元/m²·月 @ 888m² |   空置   |   333   |   精装    |     -      |   元/m²·天   | 333m² |     -     | 预租￥ -元/m²·天 @ 333m² |

		
@CreamsAPPIOS2 @MAR-2326 @lixueli
Scenario Outline: 选择多个楼宇，检查楼宇内容显示
Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
When 点击左上角入口进入楼宇侧滑栏
And 选择楼宇 "<楼宇1>" "<楼宇2>" "<楼宇3>"
And 点击右侧空白处进入楼宇列表
Then 列表显示楼宇 "<楼宇1>" "<楼宇2>" "<楼宇3>"
And 页面顶部楼宇总面积为三个楼宇的总面积 "<总面积>"


Examples:
     | 邮箱                  | 密码       |      楼宇1       |    楼宇2     |    楼宇3   |  总面积  |
     | xypeng@91souban.com  | Xy666666  | 自动化测试（不要动） | 测试大楼176幢 | 测试大楼177 | 47724.58|
     
 
@CreamsAPPIOS2 @MAR-2148
Scenario Outline: 加入分组
Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
When 点击左上角入口进入楼宇侧滑栏
And 选择楼宇 "<楼宇1>" "<楼宇2>" "<楼宇3>"
And 点击加入收藏
And 输入分组名称 "<分组名>"
And 点击确定收藏收藏成功
And 点击我的查询进入我的查询列表
Then 列表显示刚添加的分组 "<分组名>"
And 分组 "<分组名>" 中楼宇数量为 "<数量>"
When 点击右侧空白处进入楼宇列表
Then 列表显示楼宇 "<楼宇1>" "<楼宇2>" "<楼宇3>"
When 点击我进入我的主页
And 点击我的查询
#删除新建的分组
When 左滑新建的查询 "<分组名>"
Then 我的集合列表不存在分组名称为 "<分组名>"的查询，查询删除成功

Examples:
     | 邮箱                  | 密码       |       楼宇1      |     楼宇2    |    楼宇3   |       分组名       | 数量 |
     | xypeng@91souban.com  | Xy666666  | 自动化测试（不要动） | 测试大楼176幢 | 测试大楼177 | auto分组测试_ios |  3  | 