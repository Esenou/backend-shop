package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Product;
import kg.web.shop.repository.ProductRepository;
import kg.web.shop.service.ProductService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, ProductRepository> implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product dto) {
        Optional<Product> existingProduct = productRepository.findByName(dto.getName());

        if (existingProduct.isPresent()) {
            return existingProduct.get();
        }
        return super.create(dto);
    }
}
