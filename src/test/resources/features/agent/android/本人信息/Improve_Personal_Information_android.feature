Feature: 完善个人信息
	As a user
	I want to improve personal information 
	
@update-android
Scenario Outline: 用户已登录，修改个人信息，类型为公司经纪人
Given 用户 "<用户名>" "<密码>" 已成功登录
When 点击个人信息
And 修改个人信息 "<城市>" "<区域>" "<类型>" 
And 输入公司名称"<公司名称>"
And 点击完成
Then 个人信息修改成功，信息和修改时填写"<城市>" "<区域>" "<类型>"一致
And 公司名称和填写的 "<公司名称>" 一致


Examples:
|   用户名   |   密码   |城市| 区域 |    类型   |   公司名称   |
|18969187523 | Creams820|深圳市|罗湖区|  公司 |杭州auto测试公司2|



Scenario Outline: 用户已登录，重新修改个人信息为修改之前的
Given 用户 "<用户名>" "<密码>" 已成功登录
When 点击个人信息
And 修改个人信息 "<城市>" "<区域>" "<类型>"
And 点击完成
Then 个人信息修改成功，信息和修改时填写"<城市>" "<区域>" "<类型>"一致


Examples:
|   用户名   |   密码   |城市| 区域 |    类型   |
|18969187523 | Creams820|杭州市|滨江区| 自由经纪人 |