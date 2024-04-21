package BehavioralDesignPattern.Memento;

public class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    void save(CreateMemento createMemento) {
        createMemento.save(this);
    }

    void restore(CreateMemento createMemento) {
        this.width = createMemento.width;
        this.height = createMemento.height;
    }

    @Override
    public String toString() {
        return String.format("Width is %d and Height is %d", width, height);
    }
}
