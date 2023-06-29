package BehavioralDesignPattern.Observer.Example.Observable;

import BehavioralDesignPattern.Observer.Example.Observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}