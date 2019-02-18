package com.activemq.activemq1;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ConsumerListener {

    public void consumerMessage(){

        ConnectionFactory factory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageConsumer consumer = null;

        try {

            factory = new ActiveMQConnectionFactory("admin","admin","tcp://192.168.31.128:61616");

            connection = factory.createConnection();

            connection.start();

            session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);

            destination = session.createQueue("test-listener");

            consumer = session.createConsumer(destination);

            consumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {

                    try {
                        message.acknowledge();

                        ObjectMessage om = (ObjectMessage)message;

                        Object object = om.getObject();

                        System.out.println(object);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            });

            System.in.read();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(consumer!= null){
                try {
                    consumer.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if(session!= null){
                try {
                    session.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if(connection!= null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ConsumerListener listener = new ConsumerListener();
        listener.consumerMessage();
    }


}
