package BehavioralDesignPattern.Visitor.operations;

import BehavioralDesignPattern.Visitor.elements.DeluxeRoom;
import BehavioralDesignPattern.Visitor.elements.DoubleRoom;
import BehavioralDesignPattern.Visitor.elements.SingleRoom;

public class RoomBookingOperation implements RoomOperations {

    @Override
    public void operate(SingleRoom roomElement) {
        System.out.println("Booking Single Room");
    }

    @Override
    public void operate(DeluxeRoom roomElement) {
        System.out.println("Booking Deluxe Room");
    }

    @Override
    public void operate(DoubleRoom roomElement) {
        System.out.println("Booking Double Room");
    }

}
