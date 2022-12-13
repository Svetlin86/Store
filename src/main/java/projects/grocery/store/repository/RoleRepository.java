package projects.grocery.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.grocery.store.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
