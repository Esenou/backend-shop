package kg.web.shop.repository;

import kg.web.shop.entitiy.Order;

import java.util.List;

public interface OrderRepository extends BaseRepository<Order> {
    List<Order> findByCustomerId(Long customerId);
}

