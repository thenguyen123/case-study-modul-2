package services.impl;

import model.Employee;
import services.exception.NotFoundException;
import utils.Read.ReadFileEmployee;
import utils.Write.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployee {

public static final String EMPLOYEE="D:\\codegym\\case_study\\src\\data\\employee.csv ";
    @Override
    public List<Employee> disPlay() {
        return ReadFileEmployee.readFile(EMPLOYEE);
    }

    //    String id, String name, String sex, String CMND,
//    String email, String type, String address, double salary) {
    @Override
    public void addEmployee(Employee employee) {
        List<Employee> list=ReadFileEmployee.readFile(EMPLOYEE);
        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            if (employee.getId().equals(e.getId())) {
                System.out.println("id already in list Employee");
                return;
            }
        }list.add(employee);
        WriteFileEmployee.writeFile(EMPLOYEE,list);
        
    }

    @Override
    public void editEmployee(Employee employee) throws NotFoundException {
        List<Employee> list=ReadFileEmployee.readFile(EMPLOYEE);
        boolean flag=true;
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
                WriteFileEmployee.writeFile(EMPLOYEE,list);
                flag=false;
                break;
            }
        }if(flag){
            throw new NotFoundException();
        }

        }


    @Override
    public void deleteEmployee(String idEmployee) throws NotFoundException {
        List<Employee> list=ReadFileEmployee.readFile(EMPLOYEE);
        boolean flag= true;
        for (int i = 0; i < list.size(); i++) {
            Employee e=list.get(i);
            if(idEmployee.equals(e.getId())){
                list.remove(e);
                WriteFileEmployee.writeFile(EMPLOYEE,list);
                flag=false;
                break;

        }
        }if(flag){
            throw new NotFoundException();
        }
    }
}
