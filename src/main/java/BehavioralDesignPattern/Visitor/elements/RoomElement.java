package BehavioralDesignPattern.Visitor.elements;

import BehavioralDesignPattern.Visitor.operations.RoomOperations;

public interface RoomElement {
    void accept(RoomOperations roomOperations);
}
