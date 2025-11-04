package edu.icet.service;

import edu.icet.model.Customer;
import edu.icet.model.entity.CustomerEntity;
import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getCustomers();

    void addCustomer(Customer customer);

    Customer findCustomer(String id);

    List<Customer> findCustomers(String name);
}
