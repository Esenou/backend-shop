package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Order;
import kg.web.shop.entitiy.OrderItem;
import kg.web.shop.enums.OrderStatus;
import kg.web.shop.repository.OrderItemRepository;
import kg.web.shop.repository.OrderRepository;
import kg.web.shop.service.OrderService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, OrderRepository> implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        super(orderRepository);
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public void cancelOrder(Long id) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            order.setStatus(OrderStatus.CANCELLED);
            orderRepository.save(order);
        }
    }

    public void processOrder(Long id) {
        Order order = orderRepository.findById(id).orElse(null);
        if (order != null) {
            order.setStatus(OrderStatus.PROCESSED);
            orderRepository.save(order);
        }
    }
}
