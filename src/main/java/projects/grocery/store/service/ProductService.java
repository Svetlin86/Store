package projects.grocery.store.service;

import projects.grocery.store.model.Product;
import java.util.List;
public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts(int limit);
    Product getProductById(Long id);
    Product updateProduct(Product product);
    void deleteProductById(Long id);
}
