package StructuralDesignPatterns.Facade.Example.Employees;

public class IT implements Employee {

    private String name;
    private String empCode;
    private String empType;

    public IT() {}
    public IT(String name, String empCode) {
        this.name = name;
        this.empCode = empCode;
        this.empType = String.valueOf(EmpType.IT);
    }

    @Override
    public String toString() {
        return "IT{" +
                "name='" + name + '\'' +
                ", empCode='" + empCode + '\'' +
                '}';
    }
}
