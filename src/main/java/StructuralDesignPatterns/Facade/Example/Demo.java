package StructuralDesignPatterns.Facade.Example;

import StructuralDesignPatterns.Facade.Example.Employees.EmpType;
import StructuralDesignPatterns.Facade.Example.EmployeesDao.EmployeeDaoFacade;

public class Demo {

    public static void main(String ...args) {
        EmployeeDaoFacade employeeDaoFacade = new EmployeeDaoFacade();

        employeeDaoFacade.addEmployee("Sanjit", "KMBL281547");
        employeeDaoFacade.addEmployee("Halwa", "Cleaning");

        employeeDaoFacade.printEmployee(EmpType.IT);
        System.out.println("**********************************************************");
        employeeDaoFacade.printEmployee(EmpType.JANITOR);
    }
}
