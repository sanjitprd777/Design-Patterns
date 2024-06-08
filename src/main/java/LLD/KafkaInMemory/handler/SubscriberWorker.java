package LLD.KafkaInMemory.handler;

import LLD.KafkaInMemory.entities.Message;
import LLD.KafkaInMemory.entities.Topic;
import LLD.KafkaInMemory.entities.TopicSubscriber;

public class SubscriberWorker implements Runnable {

    private final Topic topic;
    private final TopicSubscriber topicSubscriber;

    public SubscriberWorker(Topic topic, TopicSubscriber topicSubscriber) {
        this.topic = topic;
        this.topicSubscriber = topicSubscriber;
    }

    @Override
    public void run() {
        synchronized (topicSubscriber) {
            while (true) {
                int currOff = topicSubscriber.getOffset().get();
                if (currOff == topic.getMessages().size()) {
                    try {
                        topicSubscriber.wait();
                    } catch (InterruptedException ex) { System.out.println(ex.getMessage()); }
                }

                Message message = topic.getMessages().get(currOff);
                topicSubscriber.consume(message);
                topicSubscriber.getOffset().compareAndSet(currOff, currOff+1);
            }
        }
    }
}
