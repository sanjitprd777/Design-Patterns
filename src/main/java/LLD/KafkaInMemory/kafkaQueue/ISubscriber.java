package LLD.KafkaInMemory.kafkaQueue;

import LLD.KafkaInMemory.entities.Message;

public interface ISubscriber {

    public String getId();

    public void consume(Message message);
}
