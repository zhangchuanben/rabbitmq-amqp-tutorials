# RabbitMQ SpringAMQP
# 下载
> git clone https://github.com/zhangchuanben/rabbitmq-amqp-tutorials.git
# 打包 
mvn clean package
# 第一章 "Hello World"

---
![image](http://www.rabbitmq.com/img/tutorials/python-one.png)
![image](http://www.rabbitmq.com/img/tutorials/prefetch-count.png)

## 运行
### 发送消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,sender

### 接收消息
> java -jar target/rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,receiver

