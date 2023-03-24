package kg.web.shop.service.impl;

import kg.web.shop.entitiy.Category;
import kg.web.shop.repository.CategoryRepository;
import kg.web.shop.service.CategoryService;
import kg.web.shop.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryRepository> implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Optional<Category> findByName(String name) {
        return categoryRepository.findByName(name);
    }
}
