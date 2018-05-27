@tag
Feature: 打开APP进入房源列表页
  打开APP进入房源列表页

  @OpenAppForIos
  Scenario: 进入房源列表页
    Given 打开App并且点击不允许
    When 向左滑动屏幕
    And 点击立即体验
    Then 进入房源列表页
