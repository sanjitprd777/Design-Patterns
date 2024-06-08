package LLD.KafkaInMemory.kafkaQueue;

import LLD.KafkaInMemory.entities.Message;
import LLD.KafkaInMemory.entities.Topic;
import LLD.KafkaInMemory.entities.TopicSubscriber;
import LLD.KafkaInMemory.handler.TopicHandler;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Queue {

    private final Map<String, TopicHandler> topicHandlers;

    public Queue(Map<String, TopicHandler> topicHandlers) {
        this.topicHandlers = topicHandlers;
    }

    public Topic createTopic(String topicName) {
        final Topic topic = new Topic(UUID.randomUUID().toString(), topicName);
        TopicHandler topicHandler = new TopicHandler(topic);
        topicHandlers.put(topic.getId(), topicHandler);
        System.out.println("Craeted topic: " + topicName);
        return topic;
    }

    public void subscribeTopic(ISubscriber subscriber, Topic topic) {
        topic.addSubscriber((TopicSubscriber) subscriber);
        System.out.println("Created subscriber: " + subscriber.getId());
    }

    public void publish(Topic topic, Message message) {
        topic.addMessage(message);
        System.out.println("Message: " + message.getMessage() + " published to topic: " + topic.getName());
        new Thread(() -> topicHandlers.get(topic.getId()).publish()).start();
    }
}
