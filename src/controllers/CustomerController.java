package controllers;

import model.Customer;
import services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    public List<Customer> disPlay() {
        return customerService.disPlay();
    }

    public void editCustomer(Customer customer) {
        customerService.editCustomer(customer);

    }


    public void add(Customer customer) {
        customerService.add(customer);
    }
}
