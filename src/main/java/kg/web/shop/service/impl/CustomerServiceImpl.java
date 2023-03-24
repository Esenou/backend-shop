package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Customer;
import kg.web.shop.repository.CustomerRepository;
import kg.web.shop.service.CustomerService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerRepository> implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

}
