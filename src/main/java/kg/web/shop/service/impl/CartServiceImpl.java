package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Cart;
import kg.web.shop.repository.CartRepository;
import kg.web.shop.service.CartService;
import kg.web.shop.service.ProductService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends BaseServiceImpl<Cart, CartRepository> implements CartService {


    private final CartRepository cartRepository;


    public CartServiceImpl(CartRepository cartRepository, ProductService productService) {
        super(cartRepository);
        this.cartRepository = cartRepository;
    }

}
