package BehavioralDesignPattern.Visitor.elements;

import BehavioralDesignPattern.Visitor.operations.RoomOperations;

public class DeluxeRoom implements RoomElement {

    @Override
    public void accept(RoomOperations roomOperations) {
        roomOperations.operate(this);
    }
}
