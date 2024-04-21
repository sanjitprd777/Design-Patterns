package BehavioralDesignPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<CreateMemento> createMementos;

    public CareTaker() {
        createMementos = new ArrayList<>();
    }


    public void save(CreateMemento createMemento) {
        createMementos.add(createMemento);
    }

    public CreateMemento restore() {
        if(!createMementos.isEmpty()) {
            return createMementos.remove(createMementos.size()-1);
        }
        return null;
    }
}
