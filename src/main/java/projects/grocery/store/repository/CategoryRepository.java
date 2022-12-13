package projects.grocery.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.grocery.store.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
