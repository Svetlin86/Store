
// In this interface the functionalities of the application are defined

package projects.grocery.store.service;

import projects.grocery.store.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product); // Creates a product and saves in the database

    List<Product> getAllProducts(int limit);

    Product getProductById(Long id);

    Product updateProduct(Product product); // Takes the product with the updated info and saves it in DB

    void deleteProductById(Long id); // Goes in the DB finds the product by id and deletes it

}
