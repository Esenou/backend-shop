package kg.web.shop.service;

import kg.web.shop.entitiy.Order;
import kg.web.shop.service.base.BaseService;

import java.util.List;

public interface OrderService extends BaseService<Order> {

    List<Order> getOrdersByCustomerId(Long customerId);

    void cancelOrder(Long id);

    void processOrder(Long id);
}
