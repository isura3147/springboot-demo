package edu.icet.controller;


import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class CustomerController {

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

    ArrayList<Customer> customerList = new ArrayList<Customer>();

    @GetMapping("/allCustomers")
    public ArrayList<Customer> getCustomerList() {

        return customerList;
    }
}
