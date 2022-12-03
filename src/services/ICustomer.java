package services;

import model.Customer;

import java.util.List;

public interface ICustomer extends  IService{
    @Override
    List<Customer> disPlay();
    void editCustomer(Customer customer);
    void add(Customer customer);
}
