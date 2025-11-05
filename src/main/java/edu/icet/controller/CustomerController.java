package edu.icet.controller;


import edu.icet.model.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:5173")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/name")
    public String getName() {
        return "Saman";
    }

    @GetMapping("/age")
    public int getAge() {
        return 23;
    }

    @GetMapping("/details")
    public Customer getCustomer() {
        return new Customer(
                "1",
                "Jackson",
                "Panadura",
                1000.000
        );
    }

    @GetMapping("/allCustomers")
    public List<Customer> getCustomerList() {
        List<CustomerEntity> customerEntities = customerService.getCustomers();
        List<Customer> customerList = new ArrayList<>();

        for (CustomerEntity customerEntity : customerEntities) {
            customerList.add(new Customer(
                    customerEntity.getId(),
                    customerEntity.getName(),
                    customerEntity.getAddress(),
                    customerEntity.getSalary()
            ));
        }

        return customerList;
    }

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable String id) {
        return customerService.findCustomer(id);
    }


    @GetMapping("/findByName/{name}")
    public List<Customer> findByName(@PathVariable String name) {
        return customerService.findCustomers(name);
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

}

