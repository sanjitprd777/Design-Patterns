package CreationalDesignPatterns.Builder.Example2;

public class Student {
    private int id;
    private int age;
    private String name;
    private String rollNumber;

    public Student() {}

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.rollNumber = studentBuilder.getRollNumber();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", roll='" + rollNumber + '\'' +
                '}';
    }
}
