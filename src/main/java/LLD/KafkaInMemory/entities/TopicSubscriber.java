package LLD.KafkaInMemory.entities;

import LLD.KafkaInMemory.kafkaQueue.ISubscriber;

import java.util.concurrent.atomic.AtomicInteger;

public class TopicSubscriber implements ISubscriber {

    private String id;
    private AtomicInteger offset;

    public TopicSubscriber(String id) {
        this.id = id;
        this.offset = new AtomicInteger(0);
    }

    public void setId(String id) {
        this.id = id;
    }

    public AtomicInteger getOffset() {
        return offset;
    }

    public void setOffset(AtomicInteger offset) {
        this.offset = offset;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void consume(Message message) {
        System.out.println("Subscriber: " + id + " consume message: " + message.getMessage());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Subscriber: " + id + " consume message: " + message.getMessage());
    }
}
