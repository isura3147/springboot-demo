package edu.icet.service.impl;

import edu.icet.model.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerEntity> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(new CustomerEntity(
                customer.getId(),
                customer.getName(),
                customer.getAddress(),
                customer.getSalary()
        ));
    }
}
