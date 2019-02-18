package com.activemq.activemq1;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ProducerListener {

    public void sendMessage(Object object){

        ConnectionFactory factory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageProducer producer = null;
        Message message = null;

        try {

            factory = new ActiveMQConnectionFactory("admin","admin","tcp://192.168.31.128:61616");

            connection = factory.createConnection();

            connection.start();

            session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);

            destination = session.createQueue("test-listener");

            producer = session.createProducer(destination);

            connection.start();
            for (int i = 0; i < 100; i++) {

                message = session.createObjectMessage(""+i);

                producer.send(message);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(producer!= null){
                try {
                    producer.close();
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
        ProducerListener producerListener = new ProducerListener();
        producerListener.sendMessage(null);
    }


}
