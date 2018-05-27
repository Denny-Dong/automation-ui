@tag
Feature: 门店入驻申请
  I want to use this template for 测试经纪人门店入驻申请

  @CreamsAndroidTesting
  Scenario Outline: Title of your scenario
    Given 打开creamsAgent APP成功
    When 点击我tab进入我的主页
    And 点击个人信息
    When 点击登录页的注册按钮
    And 点击注册页底部的入驻申请_android
    And 选择申请入驻公司的城市_android "<城市>"
    And 填写申请入驻公司的公司名称 "<公司名称>"
    And 填写申请入驻公司的负责人姓名 "<负责人姓名>"
    And 填写申请入驻公司的联系方式 "<联系方式>"
    And 点击门店入驻页面的申请入驻按钮
    Then 门店入驻成功

    Examples: 
      |城市  |       公司名称        | 负责人姓名 |  联系方式  |
      |杭州市| 杭州匠人网络科技有限公司 |   项铭    |18158885555 |
