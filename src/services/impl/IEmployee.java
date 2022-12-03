package services.impl;

import model.Employee;
import services.IService;

import java.util.List;

public interface IEmployee  extends IService {
    @Override
    List<Employee> disPlay();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee);
    void deleteEmployee(String idemployee);

}
