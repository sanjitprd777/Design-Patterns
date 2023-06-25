package StructuralDesignPatterns.Proxy;

import StructuralDesignPatterns.Proxy.Employee.Employee;
import StructuralDesignPatterns.Proxy.Employee.EmployeeImpl;
import StructuralDesignPatterns.Proxy.Employee.EmployeeType;

public class EmployeeProxy {

    EmployeeImpl employee;

    public EmployeeProxy(EmployeeImpl employee) {
        this.employee = employee;
    }

    void addEmployee() {
        if (employee.employeeType == EmployeeType.ADMIN) {
            employee.addEmployee();
        }
        else{
            System.out.println("You don't have enough permission!");
        }
    }

    void deleteEmployee() {
        if (employee.employeeType == EmployeeType.ADMIN) {
            employee.deleteEmployee();
        }
        else {
            System.out.println("You don't have enough permission!");
        }
    }

    void viewEmployee() {
        if (employee.employeeType == EmployeeType.ADMIN || employee.employeeType == EmployeeType.USER) {
            employee.viewEmployee();
        }
        else {
            System.out.println("You don't have enough permission1");
        }
    }
}
