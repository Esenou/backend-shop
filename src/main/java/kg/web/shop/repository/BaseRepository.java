package kg.web.shop.repository;

import kg.web.shop.entitiy.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<E extends BaseEntity> extends JpaRepository<E, Long> {
}
