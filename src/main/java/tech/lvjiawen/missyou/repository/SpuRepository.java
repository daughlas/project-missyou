package tech.lvjiawen.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lvjiawen.missyou.model.Spu;

public interface SpuRepository extends JpaRepository<Spu, Long> {
    Spu findOneById(Long id);
}
