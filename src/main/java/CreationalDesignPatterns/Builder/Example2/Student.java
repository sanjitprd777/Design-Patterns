package CreationalDesignPatterns.Builder.Example2;

import CreationalDesignPatterns.Builder.Example2.StudentBuilder.StudentBuilder;

import java.util.List;

public class Student {
    // id is mandatory field.
    private int id;

    // all other fields are optional.
    private int age;
    private String name;
    private String rollNumber;
    private List<String> subjects;

    public Student() {}

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.rollNumber = studentBuilder.getRollNumber();
        this.subjects = studentBuilder.getSubjects();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", roll='" + rollNumber + '\'' +
                ", subject='" + subjects + '\'' +
                '}';
    }
}
