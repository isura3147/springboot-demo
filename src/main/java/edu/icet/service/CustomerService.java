package edu.icet.service;

import edu.icet.model.entity.CustomerEntity;
import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getCustomers();
}
