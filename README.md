# rabbitmq-operator
Operating RabbitMQ in Spring Boot .

## 如何使用

* 导入项目依赖

        <dependency>
          <groupId>com.liumapp.rabbitmq</groupId>
          <artifactId>rabbitmq-operator</artifactId>
          <version>v1.0.0</version>
        </dependency>
        
  如果您的项目所用SpringBoot为1.x系列，请使用v1.0.0版本，如果您的项目所用SpringBoot为2.x系列，请使用v2.0.0版本       

* 在SpringBoot的启动类添加以下注解:

        @Import(RabbitMQOperatorMain.class)
        
* 在项目的application.yml或其他配置文件中配置rabbitmq:
        
        spring:
          rabbitmq:
            port: 5672
            host: localhost
            username: springcloud
            password: 123456
            publisher-confirms: true
            publisher-returns: true
            #custom的值您可以自定义设置
            custom:
              appid: 9A064E7A180BB4790F827F546F699BB3
              exchange: rabbitmq-operator
              routingkey: rabbitmq-operator
              queue: rabbitmq-operator        
  
    custom的值为我自己定义的，请您确保它有值
                
* 编写消息发送publisher类、消息发送内容pattern类，消息处理consumer类

    具体可以参考core下面的HelloWorldPublisher、HelloWorldPattern和HelloWorldConsumer
    
    它的演示效果您可以通过运行demo来查看
    
    
    
                  

