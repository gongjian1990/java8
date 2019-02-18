package com.jiagoushi.activemq.helloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 发送者，helloWorld
 */
public class Sender {

    public static void main(String[] args) throws Exception {

        // 创建连接工厂
        ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER,
                                                        ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                                                        "tcp://localhost:61616");

        // 创建 connection ，并启动
        Connection connection = factory.createConnection();

        connection.start();

        // 创建session
        //Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);

        // 使用事务方式
        //Session session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);

        // 使用client 签收方式
        Session session = connection.createSession(true,Session.CLIENT_ACKNOWLEDGE);

        // 创建 destination
        Destination destination = session.createQueue("queue1");

        // 创建 producer
        //MessageProducer producer = session.createProducer(destination);

        MessageProducer producer = session.createProducer(null);

        // producer设置持久化非持久化特性
        //producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        for (int i = 0; i < 5; i++) {
            // 创建 Message
            TextMessage message = session.createTextMessage("helloworld,i="+i);

            /**
             * 参数1 ：目的地
             * 参数2 ：消息
             * 参数3 ：持久化
             * 参数4 ：优先级，0-9；0-4，普通，5-9:加急，数值越大，优先级越高
             * 参数5 ：多久过期


             activeMq 设置优先级发送：
             vim  apache-activemq-5.11.1/conf/activemq.xml

             #大概44行左右
             #设定queue="queue1" 设定 queue1 的队列是按优先级发送的
             <policyEntry queue="queue1" prioritizedMessages="true" />

             */
            producer.send(destination,message,DeliveryMode.NON_PERSISTENT,i,2*60*1000);

           // producer.send(message);
        }

        // 使用 事务，commit
        session.commit();

        System.out.println("sender 消息发送成功！ ");

        if(connection!= null){
            connection.close();
        }
    }

}
