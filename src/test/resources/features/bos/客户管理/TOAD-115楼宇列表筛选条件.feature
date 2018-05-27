@TOAD-413
Feature: 楼宇列表筛选

  #新版本不要这个功能
  @TOAD-231
  Scenario Outline: 筛选资产属性结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选资产类型 "<assertType>"
    Then 列表仅展示资产类型匹配的楼宇 "<assertType>"

    Examples: 
      | assertType |
      | 大业主自持      |

  #新版本不要这个功能
  @TOAD-230
  Scenario Outline: 筛选楼宇类型结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选楼宇类型 "<buildingType>"
    Then 列表仅展示楼宇类型匹配的楼宇 "<buildingType>"

    Examples: 
      | buildingType |
      | 科技园区         |

  @TOAD-227 
  Scenario Outline: 筛选面积结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选面积 "<minArea>", "<maxArea>"
    Then 列表仅展示面积匹配的楼宇 "<minArea>", "<maxArea>"

    Examples: 
      | minArea | maxArea |
      |      10 |     100 |

  @TOAD-224 
  Scenario Outline: 筛选省份结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选省份 "<province>"
    Then 列表仅展示省份匹配的楼宇 "<province>"

    Examples: 
      | province |
      | 浙江省      |

  @TOAD-225 
  Scenario Outline: 筛选城市结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选城市 "<province>" "<city>"
    Then 列表仅展示城市匹配的楼宇  "<city>"

    Examples: 
      | province | city |
      | 浙江省      | 杭州市  |

  @TOAD-219 
  Scenario Outline: 搜索结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 搜索楼宇名称 "<building>"
    Then 列表展示楼宇名称和所属主体匹配的楼宇  "<building>"

    Examples: 
      | building |
      | 测试结果     |

  @TOAD-218 
  Scenario Outline: 筛选起始时间结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选起始时间 "<startDate>"
    Then 列表仅展示晚于起始时间的楼宇  "<startDate>"

    Examples: 
      | startDate  |
      | 2018-04-01 |

  @TOAD-217 
  Scenario Outline: 筛选截止时间结果
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选结束时间 "<endDate>"
    Then 列表仅展示早于起始时间的楼宇  "<endDate>"

    Examples: 
      | endDate    |
      | 2018-04-01 |

  @TOAD-215 
  Scenario Outline: 选择筛选截止时间限制2
    Given 登录后台
    And 用户在楼宇列表页面
    And 筛选注册时间结束时间大于开始时间 "<startDate>" "<endDate>"
    Then 结束时间不能早于开始时间

    Examples: 
      | startDate  | endDate    |
      | 2018-04-02 | 2018-04-01 |