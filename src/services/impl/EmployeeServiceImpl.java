package services.impl;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployee {
    List<Employee> list = new ArrayList<>();

    @Override
    public List<Employee> disPlay() {
        return list;
    }

    //    String id, String name, String sex, String CMND,
//    String email, String type, String address, double salary) {
    @Override
    public void addEmployee(Employee employee) {

        list.add(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        for (int i = 0; i < list.size(); i++) {
             Employee e=list.get(i);
            if (employee.getId().equals(e.getId())) {
                e.setName(employee.getName());
                e.setSex(employee.getSex());
                e.setCMND(employee.getCMND());
                e.setEmail(employee.getEmail());
                e.setType(employee.getType());
                e.setAddress(employee.getAddress());
                e.setSalary(employee.getSalary());
                break;
            }
        }


        }


    @Override
    public void deleteEmployee(String idEmployee) {
        for (int i = 0; i < list.size(); i++) {
            Employee e=list.get(i);
            if(idEmployee.equals(e.getId())){
                list.remove(e);
        }
        }
    }
}
