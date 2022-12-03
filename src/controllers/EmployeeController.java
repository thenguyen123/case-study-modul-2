package controllers;

import model.Employee;
import services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    public void addEmployee(Employee employee) {
        employeeServiceImpl.addEmployee(employee);
    }

    public void editEmployee(Employee employee) {
        employeeServiceImpl.addEmployee(employee);
    }

    public void deleteEmployee(String idEmployee) {
        employeeServiceImpl.deleteEmployee(idEmployee);
    }
    public List<Employee> disPlay(){
       return employeeServiceImpl.disPlay();
    }
}
