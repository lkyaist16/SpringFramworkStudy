# Spring框架学习

## 关于spring

> 官网：https://spring.io/
>
> github: https://github.com/spring-projects/spring-framework

轻量级控制反转（IOC）和面向切面（AOP）的框架

Roa Johnson： Spring Framework创始人

理念：使现有技术更容易使用

- **Spring Framework 体系架构：**

![企业微信截图_15862407754513.png](http://ww1.sinaimg.cn/large/007boVColy1gdl6pvlrgzj30e90aoq41.jpg)

事务隔离级别，默认和数据库一致

优点：

1. Spring是一个开源的免费的框架
2. Spring是一个轻量级、非入侵式的框架
3. 控制反转（IOC）、面向切面编程（AOP）
4. 支持事务的处理，对框架整合的支持

## Spring-xml文件配置

- **别名：**

- **Bean的配置：**

- **导入：**

## IOC（控制反转）

- 控制反转IOC（Inversion of Control），是一种设计思想，依赖注入DI（Dependency Injection）是实现IOC的一种方法

- Service层代码不需要改变，耦合性大大降低

- 获取依赖对象的方式反转了

- 对象由Spring来创建，管理，装配

### DI（依赖注入）

- **构造器注入**

- **Set方式注入**

- **扩展方式注入**

## Bean

- **作用域**

1. 单例模式 Singleton Scope（Spring默认机制）

2. 原型模式 Prototype Scope（多例模式）

3. 其他的

- **自动装配**

## AOP（面对切面编程 Aspect-oriented Programming）

定义：通过预编译方式在运行期动态代理实现程序功能的统一维护的一种技术

## 事务

### 事务属性

- REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。 
- SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 

- MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。 

- REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起。 

- NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。 

- NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。 

- NESTED：支持当前事务，如果当前事务存在，则执行一个嵌套事务，如果当前没有事务，就新建一个事务。


### 核心接口（原理分析）

- **BeanFactory**


- **ApplicationContext**