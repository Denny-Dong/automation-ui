@noLoginClickMyPage  @KOOP-1697
Feature: 未登录时点击我主页的tab
	I want to use this template for 测试是否跳转到登录页


 @null  @KOOP-1131
Scenario: 点击我的收藏
Given 打开creamsAgent APP成功
	And 点击我tab进入我的主页
 When 点击我的收藏按钮
 Then 成功跳转到登录页
 When 点击登录页的取消按钮
 Then 回到我的主页
 
 
 @null  @KOOP-1131
Scenario: 点击个人信息
Given 打开creamsAgent APP成功
	And 点击我tab进入我的主页
 When 点击个人信息
 Then 成功跳转到登录页
 When 点击登录页的取消按钮
 Then 回到我的主页
 
 
  @null  @KOOP-1131
Scenario: 点击修改密码
Given 打开creamsAgent APP成功
	And 点击我tab进入我的主页
 When 点击修改密码按钮
 Then 成功跳转到登录页
 When 点击登录页的取消按钮
 Then 回到我的主页
