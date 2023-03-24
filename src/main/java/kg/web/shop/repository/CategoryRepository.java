package kg.web.shop.repository;

import kg.web.shop.entitiy.Category;

import java.util.Optional;

public interface CategoryRepository extends BaseRepository<Category> {
    Optional<Category> findByName(String name);
}

