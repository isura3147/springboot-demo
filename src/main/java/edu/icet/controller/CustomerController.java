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
        customerList.add(new Customer("1", "Jack", "Manhatten", 100.00));
        customerList.add(new Customer("2", "Jill", "New York", 200.00));
        customerList.add(new Customer("3", "Sarah", "Statten Island", 300.00));
        customerList.add(new Customer("4", "Jason", "Golden State", 400.00));
        return customerList;
    }
}
