package StructuralDesignPatterns.Facade.Example.Employees;

public class Janitor implements Employee {

    private String name;
    private String jobType;

    public Janitor() {}

    public Janitor(String name, String jobType) {
        this.name = name;
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Janitor{" +
                "name='" + name + '\'' +
                ", jobType='" + jobType + '\'' +
                '}';
    }
}
