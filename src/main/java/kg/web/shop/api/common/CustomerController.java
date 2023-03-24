package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Customer;
import kg.web.shop.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customer")
public class CustomerController extends BaseController<Customer, CustomerService> {
    private final CustomerService customerService;

    public CustomerController(CustomerService baseService, CustomerService customerService) {
        super(baseService);
        this.customerService = customerService;
    }
}
