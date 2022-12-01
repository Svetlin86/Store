package projects.grocery.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.grocery.store.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
