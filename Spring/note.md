##常用依赖
```xml
 <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

```
##自动装配注解xml头文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>
 


</beans>
```
##注解说明
- @Autowired：自动装配通过名字，类型
    如果有@Autowired不能唯一自动装配属性，则通过@Qualifier(value ="XXX")。

- @Nullable 字段标记的这个注解，说明这个字段可以为null。
- Resource 自动装配通过名字，属性。
+ @Component 组件，放在类上，说明这个类被spring管理了，就是bean。
