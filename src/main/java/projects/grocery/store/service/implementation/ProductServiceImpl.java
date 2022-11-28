/*
     This class contains the logic in the functionalities of
     the application defined in ProductService
*/

package projects.grocery.store.service.implementation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import projects.grocery.store.model.Product;
import projects.grocery.store.repo.ProductRepo;
import projects.grocery.store.service.ProductService;

import java.util.Collection;
import java.util.List;

import static java.lang.Boolean.TRUE;

/* With this Lombok creates a ProductServiceImpl constructor
and adds private final ProductRepo productRepo field
 */
@Service
@RequiredArgsConstructor
@Slf4j // Log allows something to be printed in the console
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public Product getProductById(Long id) {
        log.info("Fetching products by id: {}", id);
        return productRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException( // TODO change exception
                        String.format("Product with id: %d does not exist", id)));
    }

    @Override
    public List<Product> getAllProducts(int limit) {
        log.info("Listing all products"); // Log in the console
        return productRepo.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public Product createProduct(Product product) {
        log.info("Saving new product: {}", product.getName());
        return productRepo.save(product); // Save the product (save method comes from JPA)
    }

    @Override
    public Product updateProduct(Product product) {
        log.info("Updating product: {}", product.getName());
        return productRepo.save(product); // Save the product
    }

    @Override
    public void deleteProductById(Long id) { // TODO return true if successful and false if unsuccessful
        log.info("Deleting product: {}", id);
        productRepo.deleteById(id);
    }
}