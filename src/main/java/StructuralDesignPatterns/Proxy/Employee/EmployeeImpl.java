package StructuralDesignPatterns.Proxy.Employee;

public class EmployeeImpl implements Employee {

    public EmployeeType employeeType;

    public EmployeeImpl(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public void addEmployee() {
        System.out.println("New employee added");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Employee deleted");
    }

    @Override
    public void viewEmployee() {
        System.out.println("All employees");
    }
}
