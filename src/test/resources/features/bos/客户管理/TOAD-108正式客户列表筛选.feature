@TOAD-413
Feature: 正式客户列表筛选

  @TOAD-193 @AcceptenceTestBOS
  Scenario Outline: 筛选跟进人
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选跟进人 "<city>" "<followPeople>"
    Then 列表仅展示跟进人匹配的正式客户 "<followPeople>"

    Examples: 
      | city | followPeople |
      | 杭州市  | 后台自动化测试账号        |

  #新版本不要这个功能
  @TOAD-191
  Scenario Outline: 筛选客户性质
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选客户性质 "<customerNature>"
    Then 列表仅展示客户性质匹配的正式客户 "<customerNature>"

    Examples: 
      | customerNature |
      | 国企             |

  @TOAD-189 @AcceptenceTestBOS
  Scenario Outline: 筛选本月至少登录次数
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选本月至少登录次数 "<monthLoginCount>"
    Then 列表仅展示本月至少登录匹配的正式客户 "<monthLoginCount>"

    Examples: 
      | monthLoginCount |
      |              1 |

  @TOAD-186 @AcceptenceTestBOS
  Scenario Outline: 筛选省份
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选省份 "<province>"
    Then 列表仅展示省份匹配的正式客户 "<province>"

    Examples: 
      | province |
      | 浙江省      |

  @TOAD-187 @AcceptenceTestBOS
  Scenario Outline: 筛选城市
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选城市 "<province>" "<city>"
    Then 列表仅展示城市匹配的正式客户  "<city>"

    Examples: 
      | province | city |
      | 浙江省      | 杭州市  |

  @TOAD-181 @AcceptenceTestBOS
  Scenario Outline: 筛选搜索内容
    Given 登录后台
    And 用户在正式客户列表页面
    And 搜索客户名称 "<name>"
    Then 列表仅展示客户名称匹配的正式客户  "<name>"

    Examples: 
      | name |
      | 匠人   |

  @TOAD-175 @AcceptenceTestBOS
  Scenario Outline: 筛选正式客户注册时间
    Given 登录后台
    And 用户在正式客户列表页面
    And 筛选注册时间 "<startDate>" "<endDate>"
    Then 列表仅展示时间段内的正式客户  "<startDate>" "<endDate>"

    Examples: 
      | startDate  | endDate    |
      | 2018-05-01 | 2018-05-02 |
