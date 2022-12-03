package services.impl;

import model.Customer;
import services.ICustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomer {
    List<Customer> list = new ArrayList<>();

    @Override
    public List<Customer> disPlay() {
        return list;
    }

    @Override
    public void editCustomer(Customer customer) {
        for (int i = 0; i < list.size() ; i++) {
            Customer c=list.get(i);
            if (c.getId().equals(customer.getId())) {
                c.setAddress(customer.getAddress());
                c.setName(customer.getName());
                c.setCMND(customer.getCMND());
                c.setEmail(customer.getEmail());
                c.setSex(customer.getSex());
                c.setType(customer.getType());

                break;
            }
        }
    }

    @Override
    public void add(Customer customer) {
        list.add(customer);
    }
}
