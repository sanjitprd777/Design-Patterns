package BehavioralDesignPattern.Memento;

public class CreateMemento {

    int width;
    int height;

    public CreateMemento(){}

    public void save(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}
