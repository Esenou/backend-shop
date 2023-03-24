package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Order;
import kg.web.shop.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController extends BaseController<Order, OrderService> {
    private final OrderService orderService;
    public OrderController(OrderService baseService, OrderService orderService) {
        super(baseService);
        this.orderService = orderService;
    }
}
