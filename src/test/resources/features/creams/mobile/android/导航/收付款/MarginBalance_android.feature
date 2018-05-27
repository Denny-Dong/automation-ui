@tag
Feature: 保证金余额
  I want to use this template for marginBalance

  @CreamsAPPAndroid  @wangshengwei @MAR-7096 @MAR-7146
  Scenario Outline: 搜索保证金账单
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击页面顶部的搜索框进入搜索页
    And 在搜索框内输入对方名称 "<对方名称>"
    Then 列表包含搜索的对方名称的账单 "<对方名称>"
    And android账单的关键字显示正确 "<对方名称>" "<房号>" "<需收金额>" "<逾期状态>" "<应收时间>" "<楼宇>" "<账单金额>" "<实收金额>"
    And android账单逾期状态的内容及天数显示正确 "<对方名称>"

    Examples: 
      |        邮箱       |   密码   |       楼宇       |   对方名称    | 房号 |     需收金额     |逾期状态| 应收时间 | 账单金额 |实收金额|
      |xypeng@91souban.com|Pexy6666|自动化测试（不要动）|自动化测试保证金 |1-100|需收 ¥ 8,500.00 | 未结清 |2018-02-06|10,000.00| 1,000.00 |



  @CreamsAPPAndroid  @wangshengwei @MAR-7166
  Scenario Outline: 进入详情页，检查详情内容
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击页面顶部的搜索框进入搜索页
    And 在搜索框内输入对方名称 "<对方名称>"
    Then 列表包含搜索的对方名称的账单 "<对方名称>"
    And 点击账单对方名称为 "<对方名称>"的账单
    Then 进入账单详情页
    And android账单信息字段显示正确 "<账单金额>" "<实收金额>" "<需收金额>" "<保证金余额>" "<费用类型>" "<账单状态>" "<账单编号>" "<计费周期>" "<应收时间>" "<创建时间>" "<跟进人>" "<备注>"
    And android付款方信息字段显示正确 "<对方名称>" "<付款方联系人>" "<合同编号>"
    And 房源信息字段显示正确 "<楼宇>" "<楼层房号>" "<面积>"
    And 收支流水字段显示正确 "<对方名称>" "<借贷标>" "<发生额>" "<匹配金额>" "<入账日>" "<摘要>"
    And 调整字段显示正确 "<调整金额>" "<调整类型>" "<调整时间>" "<调整备注>"

    Examples: 
      |        邮箱       |   密码   |       楼宇      |   对方名称    |  账单金额 | 实收金额 |需收金额 |保证金余额| 费用类型 |账单状态|  账单编号  |        计费周期       |  应收时间 |  创建时间  | 跟进人 |     备注    |付款方联系人|合同编号| 楼层房号 | 面积|  借贷标  | 发生额 |匹配金额|   入账日  |摘要|调整金额|调整类型|  调整时间  |调整备注|
      |xypeng@91souban.com|Pexy6666 |自动化测试（不要动）|自动化测试保证金 |10000.00 | 1000.00 |8500.00 |1000.00 |租金保证金|未结清 | 账单编号  |2018-02-08~2018-03-08 |2018-02-06|2018-04-16|小破孩 |自动化测试保证金  | silence  |合同编号|1层 100室|100m²|贷（收入）|1000.00|1000.00|2018-02-08| 自动化 |500.00| 特批调整|2018-02-08|自动化500|




  @CreamsAPPAndroid   @wangshengwei @MAR-7584 @MAR-7585 @MAR-7586
  Scenario Outline: 进入详情页，添加、编辑、删除备注
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击页面顶部的搜索框进入搜索页
    And 在搜索框内输入对方名称 "<对方名称>"
    Then 列表包含搜索的对方名称的账单 "<对方名称>"
    And 点击账单对方名称为 "<对方名称>"的账单
    Then 进入账单详情页
    When 点击账单详情页的操作按钮
    And 选择备注
    Then 进入备注列表
    
    #添加备注
    When 点击备注列表的新增按钮
    And 输入备注内容 "<备注内容>"
    And 点击新增备注页的保存按钮
    Then 备注列表中存在一条备注内容为 "<备注内容>"的备注，备注新增成功
    And 备注信息显示正确 "<备注内容>" "<姓名>" "<本人标识>"
    
    #编辑备注
    When 点击备注内容为 "<备注内容>"的备注的操作按钮
    And 点击备注的编辑按钮
    And 修改备注内容 "<新备注内容>"
    And 点击编辑备注页的保存按钮
    Then 备注列表中存在一条备注内容为 "<新备注内容>"的备注，备注修改成功
    
    #删除备注
    When 点击备注内容为 "<新备注内容>"的备注的操作按钮
    And 点击备注的删除按钮
    And 点击确定要删除该条备注吗页面的确定按钮
    Then 备注列表中不存在一条备注内容为 "<信备注内容>"的备注，备注删除成功

    Examples: 
       |        邮箱       |   密码   |       楼宇      |   对方名称    |    备注内容     |  姓名  |本人标识|新备注内容|
       |xypeng@91souban.com|Pexy6666|自动化测试（不要动）|自动化测试保证金 |自动化账单备注功能|小破孩|(本人)|编辑备注功能|




  @CreamsAPP   @wangshengwei @MAR-7723
  Scenario Outline: 进入详情页，合同跳转
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击页面顶部的搜索框进入搜索页
    And 在搜索框内输入对方名称 "<对方名称>"
    Then 列表包含搜索的对方名称的账单 "<对方名称>"
    And 点击账单对方名称为 "<对方名称>"的账单
    Then 进入账单详情页
    When 点击付款方信息中的合同编号 "<合同编号>"
    Then 进入合同详情页
    And 合同租客"<租客>"显示正确

    Examples: 
    |        邮箱       |   密码   |       楼宇       |   对方名称     |      合同编号    |租客|
    |xypeng@91souban.com|Pexy6666|自动化测试（不要动）|自动化测试保证金 |DT666666-2018-00011|自动化合同|
    


  @CreamsAPP  @wangshengwei @MAR-7724
  Scenario Outline: 进入详情页，房源跳转
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击页面顶部的搜索框进入搜索页
    And 在搜索框内输入对方名称 "<对方名称>"
    Then 列表包含搜索的对方名称的账单 "<对方名称>"
    And 点击账单对方名称为 "<对方名称>"的账单
    Then 进入账单详情页
    When 点击房源信息中的楼宇房号 "<楼宇房号>"
    Then 进入房源详情页
    And 房号信息"<房号>"显示正确
    
    Examples: 
    |        邮箱       |   密码   |        楼宇      |   对方名称     |  楼宇房号 |房号|
    |xypeng@91souban.com|Pexy6666 |自动化测试（不要动）|自动化测试保证金 |1层   100室|1楼/100室|



  @CreamsAPPAndroid  @wangshengwei @MAR-7723
  Scenario Outline: 保证金列表字段检查
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    When 点击保证金余额进入保证金列表
    Then 保证金列表中的字段显示正确

    Examples:
      |        邮箱       |   密码   |       楼宇       |
      |xypeng@91souban.com|Pexy6666|自动化测试（不要动） |


  @CreamsAPPAndroid  @wangshengwei @MAR-7723
  Scenario Outline: 保证金通过预期状态筛选
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击保证金余额列表的筛选按钮
    And 选择筛选条件为逾期状态 "<逾期状态>"
    And 点击保证金余额筛选页的确定按钮
    Then 保证金列表中所有记录的逾期状态显示 "<逾期>"

    Examples:
      |        邮箱       |   密码   |       楼宇       |逾期状态|逾期|
      |xypeng@91souban.com|Pexy6666|自动化测试（不要动） | 已逾期 |逾期 |



  @CreamsAPPAndroid  @wangshengwei @MAR-7723
  Scenario Outline: 保证金通过预期状态筛选
    Given 输入邮箱 "<邮箱>"和密码 "<密码>"成功登录CreamsAPP
    And 点击左上角入口进入楼宇侧滑栏
    And 选择楼宇 "<楼宇>"
    And 点击右侧空白处进入楼宇 "<楼宇>" 列表
    And 点击导航进入导航页面
    And 点击保证金余额进入保证金列表
    When 点击保证金余额列表的筛选按钮
    And 选择筛选条件为结清状态 "<结清状态>"
    And 点击保证金余额筛选页的确定按钮
    Then 保证金列表中所有记录的结清状态显示 "<结清状态>"

    Examples:
      |        邮箱       |   密码   |       楼宇       |结清状态|
      |xypeng@91souban.com|Pexy6666|自动化测试（不要动） | 未结清|