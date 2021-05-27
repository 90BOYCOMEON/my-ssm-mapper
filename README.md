#### Spring+SpringMVC+MyBatis+通用mapper+通用mapper的生成器


#### 注意：驱动包用的是mysql-connector-java-8.0.11.jar
####注意：新版的驱动类改成了com.mysql.cj.jdbc.Driver
1. 指定时区 北京时间东八区 serverTimezone=GMT%2B8
2. UTC代表的是全球标准时间
3. useSSL=false




使用druid数据库连接池。
mybatis-generator-maven-plugin从数据库表生成POJO和对应的mapper。
1. 执行插件mybatis-generator-maven-plugin，来生成代码

