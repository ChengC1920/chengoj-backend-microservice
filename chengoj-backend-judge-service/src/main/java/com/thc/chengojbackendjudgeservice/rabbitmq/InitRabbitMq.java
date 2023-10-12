package com.thc.chengojbackendjudgeservice.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class InitRabbitMq {
    public static void doInitCodeMq() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String EXCHANGE_NAME = "code_exchange";
            channel.exchangeDeclare(EXCHANGE_NAME, "direct");

            // 创建 code 队列
            String codeQueue = "code_queue";
            channel.queueDeclare(codeQueue, true, false, false, null);
            channel.queueBind(codeQueue, EXCHANGE_NAME, "my_routingKey");
            log.info("消息队列启动成功！");
        } catch (Exception e) {
            log.error("消息队列启动失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        doInitCodeMq();
    }
}
