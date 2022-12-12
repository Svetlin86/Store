package projects.grocery.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.grocery.store.model.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
