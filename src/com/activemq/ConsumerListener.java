package com.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class ConsumerListener {

    private static final String USERNAME = "guest";
    //默认连接密码
    private static final String PASSWORD = "guest";
    //默认连接地址
    private static final String BROKER_URL = "tcp://192.168.31.128:61616";

    public void consumerMessage()throws IOException, JMSException {
        //连接工厂

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER_URL);
        Session session = null;
        Connection connection = null;
        try {
            //连接
            connection = connectionFactory.createConnection();
            //启动连接
            connection.start();
            //创建session
            session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
            //消息目的地
            Destination destination = session.createQueue("first-mq");
            //消息消费者
            MessageConsumer consumer = session.createConsumer(destination);
            // 注册监听器，注册成功后，队列中的消息会自动触发监听器代码，接收消息并处理
            consumer.setMessageListener(new MessageListener() {
                /**
                 * 监听器一旦注册，永久有效
                 * 永久 consumer线程不关闭
                 * 处理消息的方式：只要有消息未处理，自动调用onMessage方法，处理消息
                 * 监听器可以注册若干，注册多个监听器，相当于集群
                 * ActiveMq自动循环调用多个监听器，处理队列中的消息，实现并行处理
                 *
                 * 处理消息的方法，就是监听方法
                 * 监听的事件是：消息，消息未处理
                 * 要处理的具体内容：消息处理
                 *
                 * @param message 未处理的消息
                 */
                @Override
                public void onMessage(Message message) {

                    try {
                        // acknowledge 方法。代表consumer已经收到消息，确定后，MQ删除对应消息
                        message.acknowledge();
                        ObjectMessage om = (ObjectMessage)message;
                        Object data = om.getObject();
                        System.out.println(data);

                    } catch (JMSException e) {
                        e.printStackTrace();
                    }

                }
            });

            // 阻塞当前代码，表示listener代码未结束
            System.in.read();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(session!= null){
                session.close();
            }
            if(connection!= null){
                connection.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ConsumerListener listener = new ConsumerListener();
        listener.consumerMessage();

    }




//    public static void main(String[] args) throws IOException, JMSException {
//        //连接工厂
//
//        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER_URL);
//        Session session = null;
//        Connection connection = null;
//        try {
//            //连接
//            connection = connectionFactory.createConnection();
//            //启动连接
//            connection.start();
//            //创建session
//            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            //消息目的地
//            Destination destination = session.createQueue("first-mq");
//            //消息消费者
//            MessageConsumer consumer = session.createConsumer(destination);
//            // 注册监听器，注册成功后，队列中的消息会自动触发监听器代码，接收消息并处理
//            consumer.setMessageListener(new MessageListener() {
//                /**
//                 * 监听器一旦注册，永久有效
//                 * 永久 consumer线程不关闭
//                 * 处理消息的方式：只要有消息未处理，自动调用onMessage方法，处理消息
//                 * 监听器可以注册若干，注册多个监听器，相当于集群
//                 * ActiveMq自动循环调用多个监听器，处理队列中的消息，实现并行处理
//                 *
//                 * 处理消息的方法，就是监听方法
//                 * 监听的事件是：消息，消息未处理
//                 * 要处理的具体内容：消息处理
//                 *
//                 * @param message 未处理的消息
//                 */
//                @Override
//                public void onMessage(Message message) {
//
//                    try {
//                        ObjectMessage om = (ObjectMessage)message;
//                        Object data = om.getObject();
//                        System.out.println(data);
//
//                    } catch (JMSException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//
//                System.in.read();
//
////
////            while (true) {
////                TextMessage message = (TextMessage) consumer.receive();
////                if (message != null) {
////                    System.out.println("接收到消息： " + message.getText());
////                } else {
////                    break;
////                }
////            }
//            session.close();
//            connection.close();
//        } catch (JMSException e) {
//            e.printStackTrace();
//        }finally {
//            if(session!= null){
//                session.close();
//            }
//            if(connection!= null){
//                connection.close();
//            }
//
//        }
//    }

}
