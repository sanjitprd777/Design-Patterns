package BehavioralDesignPattern.Visitor.elements;

import BehavioralDesignPattern.Visitor.operations.RoomOperations;

public class DoubleRoom implements RoomElement {

    @Override
    public void accept(RoomOperations roomOperations) {
        roomOperations.operate(this);
    }
}
