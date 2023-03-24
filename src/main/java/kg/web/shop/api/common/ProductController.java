package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Product;
import kg.web.shop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController extends BaseController<Product, ProductService> {
    private final ProductService productService;

    public ProductController(ProductService baseService, ProductService productService) {
        super(baseService);
        this.productService = productService;
    }
}
