package projects.grocery.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projects.grocery.store.model.Product;
import projects.grocery.store.service.implementation.ProductServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok().body(productService.getAllProducts(100));
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(Product product) {
        return ResponseEntity.ok().body(productService.createProduct(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.getProductById(id));
    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(Product product) {
        return ResponseEntity.ok().body(productService.updateProduct(product));
    }

    @DeleteMapping
    public void deleteProductById(Long id) {
        productService.deleteProductById(id);
    }

    // TODO Response body and domain objects
}