/*
     This class contains the logic in the functionalities of
     the application defined in ProductService
*/

package projects.grocery.store.service.implementation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import projects.grocery.store.model.Product;
import projects.grocery.store.repo.ProductRepo;
import projects.grocery.store.service.ProductService;

import java.math.BigDecimal;
import java.util.Collection;

import static java.lang.Boolean.TRUE;

/* With this Lombok creates a ProductServiceImpl constructor
and adds private final ProductRepo productRepo field
 */
@RequiredArgsConstructor
@Service
@Slf4j // Log allows something to be printed in the console
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public Product create (Product product) {
        log.info("Saving new product: {}",product.getName()); // Log in the console
        return productRepo.save (product); // Save the product (save method comes from JPA)
    }

    @Override
    public Product setQuantity (Product product, int quantity) {
        log.info("Setting product quantity");
        product.setQuantity (quantity);
        return productRepo.save (product);
    }

//    @Override
//    public Product check (Product product ,int quantity) {
//        log.info("Checking product quantity"); // Log in the console
//        return productRepo.findByQuantity (product,quantity);
//    }

    @Override
    public Collection<Product> list() {
        log.info("Listing all products"); // Log in the console
        return productRepo.findAll (PageRequest.ofSize(100)).toList();
    }

//    @Override
//    public @NotEmpty (message = "Please specify the name of the product") String get(String name) {
//        log.info("Listing products by name: {}", name); // Log in the console
//        return productRepo.findByName(name).getName();
//    }

    @Override
    public Product update (Product product) {
        log.info("Updating product: {}",product.getName()); // Log in the console
        return productRepo.save(product); // Save the product
    }

    @Override
    public Boolean delete (Long id) {
        log.info("Deleting product: {}", id); // Log in the console
        productRepo.deleteById(id);
        return TRUE;
    }

}
