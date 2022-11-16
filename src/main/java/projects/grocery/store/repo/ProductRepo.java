
// This interface is used for data manipulation

package projects.grocery.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.grocery.store.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findByName(String name);
    Product findByQuantity(Product product ,int quantity);
}
