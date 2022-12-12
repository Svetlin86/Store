package projects.grocery.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.grocery.store.model.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
