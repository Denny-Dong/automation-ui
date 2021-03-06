Feature: 房源列表筛选
	I want to 通过筛选获取楼盘


@filtrate_by_area
Scenario Outline: 通过区域筛选
Given 已成功进入房源列表
When 点击筛选进入筛选页面
And 选择区域 "<区域>" 和商圈 "<商圈>"
And 点击确定
Then 列表中符合筛选条件的楼盘共 "<几>" 个
And 符合筛选条件的楼盘 "<楼盘>"显示正确

Examples:
    | 区域  |  商圈  |     楼盘    | 几 |
    | 西湖区 |城西商圈|西湖国际科技大厦| 1 |

    
@filtrate_by_size
Scenario Outline: 通过面积筛选，手动输入面积
Given 已成功进入房源列表
When 点击筛选进入筛选页面
And 点击面积最小值输入框输入最小面积 "<最小面积>"
And 点击确定
#Then 列表中符合筛选条件的楼盘共 "<几>" 个
And 符合筛选条件的楼盘 "<楼盘1>" "<楼盘2>" "<楼盘3>" "<楼盘4>" "<楼盘5>"显示正确

Examples:
	  | 最小面积 | 几 |   楼盘1  |    楼盘2     |   楼盘3   | 楼盘4 |    楼盘5    |
    |   900  | 5 |远方科技中心|聚落5号创意产业园|民生金融中心|迪凯银座|西湖国际科技大厦|
    
    
    
@filtrate_by_day_price
Scenario Outline: 通过日租金筛选，手动输入日租金最大值
Given 已成功进入房源列表
When 点击筛选进入筛选页面
And 点击日租金
And 点击租金最大值输入框输入最大租金 "<最大租金>"
And 点击确定
Then 列表中符合筛选条件的楼盘共 "<几>" 个
And 符合筛选条件的楼盘 "<楼盘>"显示正确

Examples:
	  | 最大租金 | 几 |    楼盘   |
    |    1   | 1 |钱江国际商务中心|
    
    
@filtrate_by_month_price
Scenario Outline: 通过月租金筛选，手动输入最小和最大租金
Given 已成功进入房源列表
When 点击筛选进入筛选页面
And 点击月租金
And 点击租金输入框输入最大租金 "<最小租金>" 和最小租金 "<最大租金>"
And 点击确定
Then 列表中符合筛选条件的楼盘共 "<几>" 个
And 显示暂无相符房源

Examples:
	 |最小租金| 最大租金 | 几 |
    | 110 |   130  | 0 |
    
    
@combination_filtrate
Scenario Outline: 多个条件组合筛选
Given 已成功进入房源列表
When 点击筛选进入筛选页面
And 选择区域 "<区域>" 和商圈 "<商圈>"
And 点击选择面积区间 "<面积区间>"
And 点击日租金
And 点击选择租金区间 "<租金区间>"
And 点击确定
Then 列表中符合筛选条件的楼盘共 "<几>" 个
And 符合筛选条件的楼盘 "<楼盘1>" "<楼盘2>" "<楼盘3>"显示正确

Examples:
	 | 区域  |  商圈  | 面积区间  | 租金区间 | 几 |  楼盘1   |    楼盘2     |   楼盘3   |
   | 滨江区 |长河商圈 | 200-300 |   1-2  | 3 |测试大楼171|   京安创业园   | 金润科技园 |
