package kg.web.shop.service.base;

import kg.web.shop.entitiy.BaseEntity;
import kg.web.shop.entitiy.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface BaseService <T extends BaseEntity>{
    T create(T dto);

    T update(T dto);

    void deleteById(Long id);

    List<T> findByAll();

    Optional<T> findById(Long id);

    Page<T> findByAllWithPagination(Pageable pageable);
}
