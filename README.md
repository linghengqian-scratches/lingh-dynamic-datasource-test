### 这个问题已经在 https://github.com/baomidou/dynamic-datasource-spring-boot-starter/commit/9a55abf799ec8554b0362640a2426f3c7c88f92a 得到解决.故存档.

- 数据库文件为`file/mybatis.sql`
- 数据库配置在`src/main/resources/application-test.yml`内
- 使用`MySQL 8.0.27`测试.
- 测试用例在`src/test/java/com/lingh/LinghDynamicDatasourceTestApplicationTests.java`
- pom.xml可改动`com.baomidou:dynamic-datasource-spring-boot-starter`,3.4.1正常,3.5.0异常.
