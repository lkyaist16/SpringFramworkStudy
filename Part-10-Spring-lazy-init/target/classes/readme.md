# 关于bean的实例化

## 实例化过程

lazy-init参数配置

IoC容器的依赖注入触发和<bean>标签中的lazy-init（预实例化）属性有关，默认lazy即为false

1. lazy-init = true 用户第一次向IoC容器索要Bean的时候触发（例如：调用IoC容器getBean()方法）

2. lazy-init = false，Spring启动时容器初始化阶段被实例化

3. 如果有两个类B依赖于A，A设置了lazy-init = true，B设置了lazy-init = false，那么A也会被提前实例化

## 实例化方式

有以下三种：

1. 构造函数
1. 工厂方法
1. 动态代理

## 生命周期

1. Bean实例的创建
2. 为Bean实例设置属性
3. 调用Bean的初始化方法
4. 应用可以通过IoC容器使用Bean
5. 当容器关闭时，调用Bean的销毁方法