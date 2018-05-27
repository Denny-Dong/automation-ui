@tag
Feature: 未登录下的我的需求页
	测试未登录下的我的需求页

@click   @KOOP-1202
Scenario Outline: 未登录下的我需求
Given 打开creamsAgent APP成功
	And 点击我tab进入我的主页
 When 点击我的需求按钮
 Then 跳转到登录页
 When 输入用户名 "<用户名>"和密码"<密码>"后，点击登录按钮
 Then 登录账号成功

  
  Examples:
    |   用户名       |     密码     | 
    | 18969187523 | Creams820 |