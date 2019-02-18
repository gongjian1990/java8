package com.jiagoushi.activemq.helloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Reciever {

    public static void main(String[] args) throws Exception {

        // 创建连接工厂
        ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                "tcp://localhost:61616");

        // 创建 connection ，并启动
        Connection connection = factory.createConnection();

        connection.start();

        // 创建session
        Session session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);

        // 创建 destination
        Destination destination = session.createQueue("queue1");

        // 创建 consumer
        MessageConsumer consumer = session.createConsumer(destination);


        while (true){
            TextMessage  message = (TextMessage)consumer.receive();

            // 手动签收
            message.acknowledge();

            if(message==null){
                break;
            }

            String text = message.getText();
            System.out.println("接收到信息==="+text);

        }
    }
}
