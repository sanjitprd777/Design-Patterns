package BehavioralDesignPattern.Visitor.operations;

import BehavioralDesignPattern.Visitor.elements.DeluxeRoom;
import BehavioralDesignPattern.Visitor.elements.DoubleRoom;
import BehavioralDesignPattern.Visitor.elements.SingleRoom;

public interface RoomOperations {
    void operate(SingleRoom roomElement);
    void operate(DeluxeRoom roomElement);
    void operate(DoubleRoom roomElement);
}
