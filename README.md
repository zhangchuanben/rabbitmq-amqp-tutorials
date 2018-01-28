# # RabbitMQ SpringAMQP
# 下载
> git clone https://github.com/zhangchuanben/rabbitmq-amqp-tutorials.git
# 打包 
mvn clean package
# 第一章 "Hello World"

---
![image](http://www.rabbitmq.com/img/tutorials/python-one.png)
## 运行
### 发送消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender

### 接收消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver


# 第二章 Work Queues
---

![image](http://www.rabbitmq.com/img/tutorials/python-two.png)

### 发送消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender

### 接收消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver

# 第三章 Publish/Subscribe
---
![image](http://www.rabbitmq.com/img/tutorials/python-three-overall.png)

### 发送消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=pub-sub,sender 
    --tutorial.client.duration=60000

### 接收消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=pub-sub,receiver --tutorial.client.duration=60000

# 第四章 Routing
---
![image](http://www.rabbitmq.com/img/tutorials/direct-exchange.png)

![image](http://www.rabbitmq.com/img/tutorials/direct-exchange-multiple.png)
![image](http://www.rabbitmq.com/img/tutorials/python-four.png)
### 发送消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=routing,sender --tutorial.client.duration=60000

### 接收消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=routing,receiver --tutorial.client.duration=60000