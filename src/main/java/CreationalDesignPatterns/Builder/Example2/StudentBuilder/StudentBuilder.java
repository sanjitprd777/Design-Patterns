package CreationalDesignPatterns.Builder.Example2.StudentBuilder;

import CreationalDesignPatterns.Builder.Example2.Student;

import java.util.List;

public abstract class StudentBuilder {

    private int id;
    private int age;
    private String name;
    private String rollNumber;
    public List<String> subjects;

    public StudentBuilder() {}

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
    public List<String> getSubjects() {
        return subjects;
    }

    public Student build() {
        return new Student(this);
    }
}
