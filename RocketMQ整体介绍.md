# RocketMQ-整体介绍

## 优点

* 支持集群模型、负载均衡、水平扩展能力
* 亿级别的消息堆积能力
* 采用零拷贝的原理、顺序写盘、随机读
* 丰富的API使用
* 代码优秀，底层通信框架采用Netty NIO框架
* NameServer代替Zookeeper
* 强调集群无单点，可扩展，任意一点高可用，水平可扩展
* 消息失败重试机制、消息可查询
* 开源社区活跃、成熟度（经过双十一考验）

## 概念模型

* Producer：消息生产者，负责产生消息，一般由业务系统负责产生消息
* Consumer：消息消费者，负责消费消息，一般是后台系统负责异步消费

* Push Consumer：Consumer的一种，需要向Consumer对象注册监听
* Pull Consumer：Consumer的一种，需要主动请求Broker拉取消息

* Producer Group：生产者集合，一般用于发送一类消息
* Consumer Group：消费者集合，一般用于接收一类消息进行消费
* Broker：MQ消息服务（中转角色，用于消息存储与生产消费转发）

