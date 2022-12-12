
// This interface is used for data manipulation

package projects.grocery.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projects.grocery.store.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
