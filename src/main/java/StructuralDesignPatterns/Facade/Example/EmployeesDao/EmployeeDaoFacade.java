package StructuralDesignPatterns.Facade.Example.EmployeesDao;

import StructuralDesignPatterns.Facade.Example.Employees.EmpType;

public class EmployeeDaoFacade {

    private final EmployeeDao employeeDao;

    public EmployeeDaoFacade() {
        employeeDao = new EmployeeDao();
    }

    public void addEmployee(String name, String ...extras) {
        employeeDao.addEmployee(name, extras);
    }

    public void printEmployee(EmpType empType) {
        employeeDao.printEmployee(empType);
    }
}
