package tech.lvjiawen.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lvjiawen.missyou.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByIsRootOrderByIndexAsc(Boolean isRoot);
}
