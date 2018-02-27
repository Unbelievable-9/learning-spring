# Learning-Spring
Spring Learning Notes

# 学习用书
[Spring in Action, Fourth Edition](https://www.manning.com/books/spring-in-action-fourth-edition)

# 学习笔记
针对每个章节的 demo 记录学习心得，自己编写的 demo **>=** 书上的 demo。比如书上是用的 XML Config，那么我会去尝试采用 Java Config。

## Section 1 - Spring into action

### Chapter 1
- 在尝试利用 Java Config 配置 AOP 时， 应该注意要在 @Configuration 配置文件中 **同时添加 @EnableAspectJAutoProxy 注解**，否则 AOP 是不会生效的(困扰了我好久！)

### Chapter 2
- 虽然 Java Config 更亲切，但是 XML 配置也得会！

### Chapter 3
- 对嵌入式数据库很感兴趣，简单研究了下 [**H2 Databse Engine**](http://www.h2database.com)
- 看到 **@Profile** 注解是基于 **@Condition** 注解的时候，眼前一亮
