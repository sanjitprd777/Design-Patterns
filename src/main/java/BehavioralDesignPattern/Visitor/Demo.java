package BehavioralDesignPattern.Visitor;

import BehavioralDesignPattern.Visitor.elements.DoubleRoom;
import BehavioralDesignPattern.Visitor.elements.RoomElement;
import BehavioralDesignPattern.Visitor.elements.SingleRoom;
import BehavioralDesignPattern.Visitor.operations.RoomBookingOperation;
import BehavioralDesignPattern.Visitor.operations.RoomOperations;
import BehavioralDesignPattern.Visitor.operations.RoomVisitOperation;

public class Demo {

    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomOperations roomVisitOperation = new RoomVisitOperation();
        singleRoom.accept(roomVisitOperation);

        RoomOperations roomBookingOperation = new RoomBookingOperation();
        singleRoom.accept(roomBookingOperation);

        RoomElement doubleRoom = new DoubleRoom();
        doubleRoom.accept(roomVisitOperation);
        doubleRoom.accept(roomBookingOperation);
    }
}
