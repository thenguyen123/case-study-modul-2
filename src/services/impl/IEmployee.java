package services.impl;

import model.Employee;
import services.IService;
import services.exception.NotFoundException;

import java.util.List;

public interface IEmployee  extends IService {
    @Override
    List<Employee> disPlay();
    void addEmployee(Employee employee);
    void editEmployee(Employee employee) throws NotFoundException;
    void deleteEmployee(String idemployee) throws NotFoundException;

}
