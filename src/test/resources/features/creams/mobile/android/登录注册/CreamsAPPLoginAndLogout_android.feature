@MAR-4986
Feature: 登录和退出登录
  I want to use this template for 登录和退出登录相关功能


  @CreamsAPPAndroid @MAR-2396   @wangshengwei
  Scenario Outline: 登录CreamsAPP
    Given APP进入登录页
    When 输入邮箱 "<邮箱>"
    And 输入密码 "<密码>"
    And 点击登录页的登录
    Then CreamsAPP登录成功，进入房源列表页
    And 退出CreamsAPP
    Examples: 
      |             邮箱      | 密码      |
      | xypeng@91souban.com  | Pexy6666  |

  @CreamsAPPAndroid  @MAR-2427   @wangshengwei
  Scenario Outline: 退出登录CreamsAPP
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击设置按钮进入设置页
    And 点击退出登录
    And 点击确认退出
    Then CreamsAPP退出成功，回到登录页

    Examples: 
      | 邮箱                   | 密码      |
      |  xypeng@91souban.com  | Pexy6666  |

  @CreamsAPPAndroid  @MAR-2429   @wangshengwei
  Scenario Outline: 取消退出登录CreamsAPP
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击我进入我的主页
    When 点击设置按钮进入设置页
    And 点击退出登录
    And 点击取消
    Then CreamsAPP退出失败，停留在设置页

    Examples: 
      |           邮箱         | 密码     |
      |  xypeng@91souban.com  | Pexy6666 |