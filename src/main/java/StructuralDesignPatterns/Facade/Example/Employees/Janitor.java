package StructuralDesignPatterns.Facade.Example.Employees;

public class Janitor implements Employee {

    private String name;
    private String jobType;
    private String empType;

    public Janitor() {}

    public Janitor(String name, String jobType) {
        this.name = name;
        this.jobType = jobType;
        this.empType = String.valueOf(EmpType.JANITOR);
    }

    @Override
    public String toString() {
        return "Janitor{" +
                "name='" + name + '\'' +
                ", jobType='" + jobType + '\'' +
                '}';
    }
}
