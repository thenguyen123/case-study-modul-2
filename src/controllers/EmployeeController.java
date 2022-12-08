package controllers;

import model.Employee;
import services.exception.NotFoundException;
import services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
 private final    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    public void addEmployee(Employee employee) {
        employeeServiceImpl.addEmployee(employee);
    }

    public void editEmployee(Employee employee) {
        employeeServiceImpl.addEmployee(employee);
    }

    public void deleteEmployee(String idEmployee) throws NotFoundException {
        employeeServiceImpl.deleteEmployee(idEmployee);
    }
    public List<Employee> disPlay(){
       return employeeServiceImpl.disPlay();
    }
}
