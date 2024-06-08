package LLD.KafkaInMemory.handler;

import LLD.KafkaInMemory.entities.Topic;
import LLD.KafkaInMemory.entities.TopicSubscriber;

import java.util.HashMap;
import java.util.Map;

public class TopicHandler {

    private final Topic topic;
    private final Map<String, SubscriberWorker> subscriberWorkers;

    public TopicHandler(Topic topic) {
        this.topic = topic;
        this.subscriberWorkers = new HashMap<>();
    }

    public Topic getTopic() {
        return topic;
    }

    public Map<String, SubscriberWorker> getSubscriberWorkers() {
        return subscriberWorkers;
    }

    public void publish() {
        for (TopicSubscriber topicSubscriber : topic.getTopicSubscribers()) {
            startSubscriberWorker(topicSubscriber);
        }
    }

    private void startSubscriberWorker(TopicSubscriber topicSubscriber) {
        final String subId = topicSubscriber.getId();
        if (!subscriberWorkers.containsKey(subId)) {
            final SubscriberWorker subscriberWorker = new SubscriberWorker(topic, topicSubscriber);
            subscriberWorkers.put(subId, subscriberWorker);
            new Thread(subscriberWorker).start();
        }
        final SubscriberWorker subscriberWorker = subscriberWorkers.get(subId);
        subscriberWorker.notify();
    }

}
