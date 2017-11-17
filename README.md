# Learning-Spring
Spring Learning Notes

# 学习用书
[Spring in Action, Fourth Edition](https://www.manning.com/books/spring-in-action-fourth-edition)

# 学习笔记
针对没个章节的 demo 记录学习心得，自己编写的 demo **>=** 书上的 demo。比如书上是用的 XML Config，那么我会去尝试 Java Config。

## Section 1 Spring into action

### Chapter 1
- 在尝试利用 Java Config 配置 AOP 时， 应该注意要在 @Configuration 配置文件中 **同时添加 @EnableAspectJAutoProxy 注解**，否则 AOP 是不会生效的(困扰了我好久！)
