# MyBatis Log EasyPlus bug示例

前提：
1. DDL如下:
```sql
CREATE TABLE `demo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `text_str` text COMMENT '字符串',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试';
```
2. 修改application.yml中数据库的配置
3. 开启MyBatis Log EasyPlus

复现步骤：
运行[Demo2714ApplicationTests](./src/test/java/com/example/demo2714/Demo2714ApplicationTests.java)中的`testInsertDemo()`