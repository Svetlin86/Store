package projects.grocery.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.grocery.store.model.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
