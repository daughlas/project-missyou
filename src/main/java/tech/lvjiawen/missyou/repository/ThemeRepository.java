package tech.lvjiawen.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.lvjiawen.missyou.model.Theme;

import java.util.List;
import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

    @Query("select t from Theme t where t.name in (:names1)")
    List<Theme> findByNames(@Param("names1") List<String> names);

    Optional<Theme> findByName(String name);
}
