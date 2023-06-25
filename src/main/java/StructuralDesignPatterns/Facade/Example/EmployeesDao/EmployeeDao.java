package StructuralDesignPatterns.Facade.Example.EmployeesDao;

import StructuralDesignPatterns.Facade.Example.Employees.EmpType;
import StructuralDesignPatterns.Facade.Example.Employees.Employee;
import StructuralDesignPatterns.Facade.Example.Employees.IT;
import StructuralDesignPatterns.Facade.Example.Employees.Janitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDao {

    List<Employee> itEmployeeList;
    List<Employee> janitorEmployeeList;

    private static final List<String> janitorJobList = Arrays.asList("Cleaning", "Helping");

    public EmployeeDao() {
        itEmployeeList = new ArrayList<>();
        janitorEmployeeList = new ArrayList<>();
    }

    public void addEmployee(String name, String ...extras) {
        if (extras.length == 0) return;
        String extra = extras[0];
        if (janitorJobList.contains(extra)) {
            janitorEmployeeList.add(new Janitor(name, extra));
        }
        else {
            itEmployeeList.add(new IT(name, extra));
        }
    }

    public void printEmployee(EmpType empType) {
        if (empType == EmpType.IT) {
            System.out.println("All IT Employees");
            for (Employee it : itEmployeeList) {
                System.out.println(it);
            }
        }
        else {
            System.out.println("All Janitor Employees");
            for (Employee janitor : janitorEmployeeList) {
                System.out.println(janitor);
            }
        }
    }
}
