@tag
Feature: 打开CreamsAgent APP进入房源列表页
	I want to use this template for 打开CreamsAgent APP进入房源列表页

@openAPP
Scenario: 进入房源列表页
Given 打开App并且点击允许
 When 向左滑动屏幕
	And 点击立即体验
 Then 进入房源列表页

