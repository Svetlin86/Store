package projects.grocery.store;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projects.grocery.store.model.Category;
import projects.grocery.store.model.Product;
import projects.grocery.store.repo.CategoryRepo;
import projects.grocery.store.repo.ProductRepo;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }


    @Bean
    CommandLineRunner run(ProductRepo productRepo, CategoryRepo categoryRepo) {
        return args -> {
            categoryRepo.save(
                    new Category()
                            .setName("FOOD"));
            categoryRepo.save(
                    new Category()
                            .setName("ALCOHOL"));
            categoryRepo.save(
                    new Category()
                            .setName("BEVERAGES"));
            categoryRepo.save(
                    new Category()
                            .setName("CIGARETTES"));

            Category food = categoryRepo
                    .findById(1L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));
            Category alcohol = categoryRepo
                    .findById(2L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));
            Category beverages = categoryRepo
                    .findById(3L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));
            Category cigarettes = categoryRepo
                    .findById(4L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));

            productRepo.save(new Product()
                            .setName("Pig Meat")
                            .setPrice(BigDecimal.valueOf(10.99))
                            .setQuantity(32)
                            .setCategory(food));
            productRepo.save(new Product()
                            .setName("Jack Daniels")
                            .setPrice(BigDecimal.valueOf(70.99))
                            .setQuantity(12)
                            .setCategory(alcohol));
            productRepo.save(new Product()
                            .setName("Fanta")
                            .setPrice(BigDecimal.valueOf(1.99))
                            .setQuantity(100))
                            .setCategory(beverages);
            productRepo.save(new Product()
                            .setName("Marlboro")
                            .setPrice(BigDecimal.valueOf(5.20))
                            .setQuantity(50))
                            .setCategory(cigarettes);
        };
    }
}
