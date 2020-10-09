package tech.lvjiawen.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.lvjiawen.missyou.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    User findByEmail(String email);
    Optional<User> findByOpenid(String openid);
    User findFirstById(Long id);
    User findByUnifyUid(Long uuid);
}
