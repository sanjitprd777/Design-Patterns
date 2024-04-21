package BehavioralDesignPattern.Visitor.operations;

import BehavioralDesignPattern.Visitor.elements.DeluxeRoom;
import BehavioralDesignPattern.Visitor.elements.DoubleRoom;
import BehavioralDesignPattern.Visitor.elements.SingleRoom;

public class RoomVisitOperation implements RoomOperations {

    @Override
    public void operate(SingleRoom roomElement) {
        System.out.println("Visited Single room");
    }

    @Override
    public void operate(DoubleRoom roomElement) {
        System.out.println("Visited Double room");
    }

    @Override
    public void operate(DeluxeRoom roomElement) {
        System.out.println("Visited Deluxe room");
    }

}
