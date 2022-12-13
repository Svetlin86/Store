package projects.grocery.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.grocery.store.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
