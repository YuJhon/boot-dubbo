# Spring Boot Dubbo/Zookeeper
#### Spring Boot 结合Zookeeper、Dubbo 实现 SOA 简单案例

#### Spring Boot前搭建过Spring MVC SOA案例，相比之前的方式，Spring Boot 确实是比较简洁，没有繁琐的配置文件，全部用注解来实现，虽然Spring Cloud 微服务现在已经很火了，但是了解一下Spring Boot中使用 Dubbo+Zookeeper来实现SOA也是向微服务架构过渡的一个尝试吧！

### 项目主要分为三个模块：
    dubbo-api: 提供公共的服务(为了解耦)
    dubbo-clent: 消费者
    dubbo-server: 服务提供者
    zookeeper: 提供服务的注册

## 下面是该项目的一些截图，方便更好的理解
#### 服务启动日志
![服务的启动](http://jiangblog.oss-cn-shanghai.aliyuncs.com/spring-boot/server-start-msg.png)
#### 客户端启动日志
![客户端启动](http://jiangblog.oss-cn-shanghai.aliyuncs.com/spring-boot/client-connect-server.png)
#### 客户端测试代码
![测试实例](http://jiangblog.oss-cn-shanghai.aliyuncs.com/spring-boot/client-controller.png)
#### 使用PostMan测试结果
![测试结果](http://jiangblog.oss-cn-shanghai.aliyuncs.com/spring-boot/dubbo-test-result.png)
#### 客户端断开连接
![断开连接](http://jiangblog.oss-cn-shanghai.aliyuncs.com/spring-boot/server-console-of-client-disconnect.png)

