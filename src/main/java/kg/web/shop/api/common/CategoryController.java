package kg.web.shop.api.common;

import kg.web.shop.api.base.BaseController;
import kg.web.shop.entitiy.Category;
import kg.web.shop.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/category")
public class CategoryController extends BaseController<Category, CategoryService> {
    private final CategoryService categoryService;

    public CategoryController(CategoryService baseService, CategoryService categoryService) {
        super(baseService);
        this.categoryService = categoryService;
    }

    @PostMapping("/save")
    public ResponseEntity<Category> save(@RequestBody Category model) {
        Optional<Category> existingCategory = categoryService.findByName(model.getName());
        if (existingCategory.isPresent()) {
            return ResponseEntity.ok(existingCategory.get());
        }
        return super.save(model);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Category> update(@RequestBody Category model, @PathVariable Long id){
        Optional<Category> existingCategory = categoryService.findByName(model.getName());
        if (existingCategory.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body(existingCategory.get());
        }
        return super.update(model, id);
    }
}
