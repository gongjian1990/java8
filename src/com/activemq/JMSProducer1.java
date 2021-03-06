package com.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JMSProducer1 {

    //默认连接用户名
    private static final String USERNAME = "guest";
    //默认连接密码
    private static final String PASSWORD = "guest";
    //默认连接地址
    private static final String BROKER_URL = "tcp://192.168.31.128:61616";

    public static void main(String[] args) {
        //连接工厂
        ConnectionFactory factory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER_URL);

        try {
            //连接
            Connection connection = factory.createConnection();
            //创建session
            // 第一个参数，是否使用事务
            //
            Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
            //消息目的地
            // 目的地唯一标记
            Destination destination = session.createQueue("first-mq");
            //消息生产者
            MessageProducer producer = session.createProducer(destination);
            //设置不持久化，此处学习，实际根据项目决定
            // producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            //启动连接
            connection.start();


            //发送消息
            for (int i = 0; i < 100; i++) {
                //创建一条文本消息
                TextMessage message = session.createTextMessage(""+i);
                //生产者发送消息
                producer.send(message);
            }

            //session.commit();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
