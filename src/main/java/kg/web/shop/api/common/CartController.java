package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Cart;
import kg.web.shop.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cart")
public class CartController extends BaseController<Cart, CartService> {
    private final CartService cartService;

    public CartController(CartService baseService, CartService cartService) {
        super(baseService);
        this.cartService = cartService;
    }
}
