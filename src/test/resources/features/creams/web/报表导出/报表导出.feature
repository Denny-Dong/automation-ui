@MAR-4088
Feature: 报表导出

  @MAR-8854 @CreamsWebExportTest @xywu 
  Scenario Outline: 楼宇列表自定义
    Given 用户登录
    And 用户在楼宇列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 省份       |

  @MAR-8855 @CreamsWebExportTest @xywu
  Scenario Outline: 楼宇列表导出
    Given 用户登录
    And 用户在楼宇列表
    When 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName |
      | 楼宇管理列表   |

  @MAR-8856 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理可招商列表自定义
    Given 用户登录
    When 用户在房源管理可招商页面
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 招商状态     |

  @MAR-8857 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理可招商列表导出
    Given 用户登录
    And 用户在房源管理可招商页面
    When 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName   |
      | 房源管理-可招商列表 |

  @MAR-8858 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理已租房源列表自定义
    Given 用户登录
    When 用户在房源管理已租房源列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 合同单价     |

  @MAR-8859 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理已租房源列表导出
    Given 用户登录
    And 用户在房源管理已租房源列表
    When 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 房源管理-已租房源列表 |

  @MAR-8860 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理所有房源列表自定义
    Given 用户登录
    When 用户在房源管理所有房源列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 合同单价     |

  @MAR-8861 @CreamsWebExportTest @xywu
  Scenario Outline: 房源管理所有房源列表导出
    Given 用户登录
    And 用户在房源管理所有房源列表
    When 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 房源管理-所有房源列表 |

  @MAR-8862 @CreamsWebExportTest @xywu
  Scenario Outline: 招商管理客户管理列表自定义
    Given 用户登录
    When 用户在招商管理客户管理列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 行业       |

  @MAR-8863 @CreamsWebExportTest @xywu
  Scenario Outline: 招商管理客户管理列表导出
    Given 用户登录
    And 用户在招商管理客户管理列表
    When 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 招商管理-客户管理列表 |

  @MAR-8864 @CreamsWebExportTest @xywu
  Scenario Outline: 招商管理我的渠道列表自定义
    Given 用户登录
    When 用户在招商管理我的渠道列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 成交量      |

  @MAR-8865 @CreamsWebExportTest @xywu
  Scenario Outline: 招商管理我的渠道列表导出
    Given 用户登录
    When 用户在招商管理我的渠道列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 招商管理-我的渠道列表 |

  @MAR-8866 @CreamsWebExportTest @xywu
  Scenario Outline: 租客管理列表自定义
    Given 用户登录
    When 用户在租客管理列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 证件号码     |

  @MAR-8869 @CreamsWebExportTest @xywu
  Scenario Outline: 租客管理列表导出
    Given 用户登录
    When 用户在租客管理列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName |
      | 租客信息列表   |

  @MAR-8870 @CreamsWebExportTest @xywu
  Scenario Outline: 租赁合同合同列表自定义
    Given 用户登录
    When 用户在租赁合同列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 租赁数单位    |

  @MAR-8871 @CreamsWebExportTest @xywu
  Scenario Outline: 租赁合同列表导出
    Given 用户登录
    When 用户在租赁合同列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName  |
      | 租赁合同-合同列表 |

  @MAR-8872 @CreamsWebExportTest @xywu
  Scenario Outline: 租赁合同归档列表自定义
    Given 用户登录
    When 用户在租赁合同归档合同列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 合同来源     |

  @MAR-8873 @CreamsWebExportTest @xywu
  Scenario Outline: 租赁合同归档合同列表导出
    Given 用户登录
    When 用户在租赁合同归档合同列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 租赁合同-归档合同列表 |

  @MAR-8874 @CreamsWebExportTest @xywu
  Scenario Outline: 物业合同列表自定义
    Given 用户登录
    When 用户在物业合同列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 合同编号     |

  @MAR-8875 @CreamsWebExportTest @xywu
  Scenario Outline: 物业合同列表导出
    Given 用户登录
    When 用户在物业合同列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName  |
      | 物业合同-合同列表 |

  @MAR-8876 @CreamsWebExportTest @xywu
  Scenario Outline: 物业合同归档合同列表自定义
    Given 用户登录
    When 用户在物业合同归档合同列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 合同编号     |

  @MAR-8877 @CreamsWebExportTest @xywu
  Scenario Outline: 物业合同归档合同列表导出
    Given 用户登录
    When 用户在物业合同归档合同列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName    |
      | 物业合同-归档合同列表 |

  @MAR-8878 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款所有账单列表自定义
    Given 用户登录
    When 用户在收付款所有账单列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 账单金额     |

  @MAR-8879 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款所有账单列表导出
    Given 用户登录
    When 用户在收付款所有账单列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName |
      | 收付款-账单列表 |

  @MAR-8880 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款保证金列表自定义
    Given 用户登录
    When 用户在收付款保证金列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 账单类型     |

  @MAR-8881 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款保证金列表导出
    Given 用户登录
    When 用户在收付款保证金列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName  |
      | 收付款-保证金列表 |

  @MAR-8882 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款收支流水列表自定义
    Given 用户登录
    When 用户在收付款收支流水列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 流水号      |

  @MAR-8883 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款收支流水列表导出
    Given 用户登录
    When 用户在收付款收支流水列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName   |
      | 收付款-收支流水报表 |

  @MAR-8884 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款开票记录列表自定义
    Given 用户登录
    When 用户在收付款开票记录列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 发票代码     |

  @MAR-8885 @CreamsWebExportTest @xywu
  Scenario Outline: 收付款开票记录列表导出
    Given 用户登录
    When 用户在收付款开票记录列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName   |
      | 收付款-开票记录报表 |

  @MAR-8886 @CreamsWebExportTest @xywu
  Scenario Outline: 资产评估租金预测列表自定义
    Given 用户登录
    When 用户在资产评估租金预测列表
    When 重置自定义列并选中"<listName>"
    Then 列表中显示"<listName>"

    Examples: 
      | listName |
      | 账单类型     |

  @MAR-8887 @CreamsWebExportTest @xywu
  Scenario Outline: 资产评估租金预测列表导出
    Given 用户登录
    When 用户在资产评估租金预测列表
    And 点击报表导出
    Then 导出报表成功 "<fileName>"

    Examples: 
      | fileName |
      | 租金预测列表   |
