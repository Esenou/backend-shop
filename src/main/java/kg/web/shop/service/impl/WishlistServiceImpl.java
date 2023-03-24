package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Wishlist;
import kg.web.shop.repository.WishlistRepository;
import kg.web.shop.service.WishlistService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class WishlistServiceImpl extends BaseServiceImpl<Wishlist, WishlistRepository> implements WishlistService {
    private final WishlistRepository wishlistRepository;

    public WishlistServiceImpl(WishlistRepository wishlistRepository) {
        super(wishlistRepository);
        this.wishlistRepository = wishlistRepository;
    }
}
