package services.impl;

import model.Customer;
import services.ICustomer;
import utils.Read.ReadCustomer;
import utils.Write.WriteFileCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomer {
public  static final String FILECUSTOMER="src/data/customer.csv";

    @Override
    public List<Customer> disPlay() {

        return ReadCustomer.readCustomer(FILECUSTOMER);
    }

    @Override
    public void editCustomer(Customer customer) {
        List<Customer> list = ReadCustomer.readCustomer(FILECUSTOMER);
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
        }WriteFileCustomer.writeFile(FILECUSTOMER,list,false);
    }

    @Override
    public void add(Customer customer) {
        List<Customer>list=new ArrayList<>();
        list.add(customer);
        WriteFileCustomer.writeFile(FILECUSTOMER,list,true);
    }
}
