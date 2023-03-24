package kg.web.shop.service.base;

import kg.web.shop.entitiy.BaseEntity;
import kg.web.shop.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<Entity extends BaseEntity, Repository extends BaseRepository<Entity>> implements BaseService<Entity>{

    protected final Repository baseRepository;

    public BaseServiceImpl(Repository baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public Entity create(Entity dto) {
        return baseRepository.save(dto);
    }

    @Override
    public Entity update(Entity dto) {
        return baseRepository.save(dto);
    }

    @Override
    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }

    @Override
    public List<Entity> findByAll() {
        return baseRepository.findAll();
    }

    @Override
    public Optional<Entity> findById(Long id) {
        return Optional.of(baseRepository.findById(id).orElseThrow(()->new RuntimeException("Not Found!")));
    }

    @Override
    public Page<Entity> findByAllWithPagination(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }
}
