package projects.grocery.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.grocery.store.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
