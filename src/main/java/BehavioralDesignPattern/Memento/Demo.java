package BehavioralDesignPattern.Memento;

public class Demo {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Rectangle rectangle = new Rectangle(5,8);
        System.out.println(rectangle);
        CreateMemento createMemento = new CreateMemento();
        createMemento.save(rectangle);

        careTaker.save(createMemento);
        rectangle.width = 4;
        rectangle.height = 6;
        System.out.println(rectangle);

        rectangle.restore(careTaker.restore());
        System.out.println(rectangle);
    }
}
