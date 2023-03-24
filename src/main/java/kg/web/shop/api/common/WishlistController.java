package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Wishlist;
import kg.web.shop.service.WishlistService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController extends BaseController<Wishlist, WishlistService> {
    private final WishlistService wishlistService;
    public WishlistController(WishlistService baseService, WishlistService wishlistService) {
        super(baseService);
        this.wishlistService = wishlistService;
    }
}
