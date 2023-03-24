package kg.web.shop.service;

import kg.web.shop.entitiy.Category;
import kg.web.shop.service.base.BaseService;

import java.util.Optional;

public interface CategoryService extends BaseService<Category> {
    Optional<Category> findByName(String name);
}
