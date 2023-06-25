package StructuralDesignPatterns.Proxy;

import StructuralDesignPatterns.Proxy.Employee.EmployeeImpl;
import StructuralDesignPatterns.Proxy.Employee.EmployeeType;

public class Demo {

    public static void main(String[] args) {
        EmployeeProxy employeeProxy = new EmployeeProxy(new EmployeeImpl(EmployeeType.ADMIN));
        employeeProxy.addEmployee();
        employeeProxy.deleteEmployee();
        employeeProxy.viewEmployee();

        System.out.println();

        EmployeeProxy employeeProxy1 = new EmployeeProxy(new EmployeeImpl(EmployeeType.USER));
        employeeProxy1.addEmployee();
        employeeProxy1.deleteEmployee();
        employeeProxy1.viewEmployee();
    }
}
