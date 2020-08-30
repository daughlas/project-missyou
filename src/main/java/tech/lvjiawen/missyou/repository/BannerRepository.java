package tech.lvjiawen.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lvjiawen.missyou.model.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {

    Banner findOneById(Long id);

    Banner findOneByName(String name);
}
