package LLD.KafkaInMemory.entities;

import java.util.ArrayList;
import java.util.List;

public class Topic {

    private final String id;
    private final String name;
    private final List<Message> messages;
    private final List<TopicSubscriber> topicSubscribers;

    public Topic(String id, String name) {
        this.id = id;
        this.name = name;
        this.messages = new ArrayList<>();
        this.topicSubscribers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<TopicSubscriber> getTopicSubscribers() {
        return topicSubscribers;
    }

    public synchronized void addMessage(Message message) {
        this.messages.add(message);
    }

    public synchronized void addSubscriber(TopicSubscriber topicSubscriber) {
        this.topicSubscribers.add(topicSubscriber);
    }
}
