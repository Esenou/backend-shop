package kg.web.shop.repository;

import kg.web.shop.entitiy.Product;

import java.util.Optional;

public interface ProductRepository extends BaseRepository<Product> {
    Optional<Product> findByName(String name);
}
