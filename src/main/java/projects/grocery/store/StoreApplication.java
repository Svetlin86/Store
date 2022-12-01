package projects.grocery.store;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projects.grocery.store.model.Category;
import projects.grocery.store.model.Product;
import projects.grocery.store.model.Role;
import projects.grocery.store.model.User;
import projects.grocery.store.repo.CategoryRepo;
import projects.grocery.store.repo.ProductRepo;
import projects.grocery.store.service.UserService;

import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }


//    @Bean
//    CommandLineRunner run(ProductRepo productRepo, CategoryRepo categoryRepo, UserService userService) {
//        return args -> {
//            categoryRepo.save(
//                    new Category()
//                            .setName("FOOD"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("ALCOHOL"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("BEVERAGES"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("CIGARETTES"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("SWEETS"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("DOMESTIC"));
//            categoryRepo.save(
//                    new Category()
//                            .setName("AUTO"));
//
//            Category food = categoryRepo
//                    .findById(1L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category alcohol = categoryRepo
//                    .findById(2L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category beverages = categoryRepo
//                    .findById(3L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category cigarettes = categoryRepo
//                    .findById(4L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category sweets = categoryRepo
//                    .findById(5L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category domestic = categoryRepo
//                    .findById(6L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//            Category auto = categoryRepo
//                    .findById(7L)
//                    .orElseThrow(() -> new IllegalArgumentException("not found"));
//
//            productRepo.save(new Product()
//                                .setName("Pig Meat")
//                                .setPrice(BigDecimal.valueOf(10.99))
//                                .setQuantity(32)
//                                .setCategory(food));
//            productRepo.save(new Product()
//                                .setName("Jack Daniels")
//                                .setPrice(BigDecimal.valueOf(70.99))
//                                .setQuantity(12)
//                                .setCategory(alcohol));
//            productRepo.save(new Product()
//                                .setName("Coca-Cola")
//                                .setPrice(BigDecimal.valueOf(1.99))
//                                .setQuantity(100)
//                                .setCategory(beverages));
//            productRepo.save(new Product()
//                                .setName("Marlboro")
//                                .setPrice(BigDecimal.valueOf(5.20))
//                                .setQuantity(50)
//                                .setCategory(cigarettes));
//            productRepo.save(new Product()
//                                .setName("Cheese")
//                                .setPrice(BigDecimal.valueOf(17.99))
//                                .setQuantity(90)
//                                .setCategory(food));
//            productRepo.save(new Product()
//                                .setName("Vodka")
//                                .setPrice(BigDecimal.valueOf(18.99))
//                                .setQuantity(122)
//                                .setCategory(alcohol));
//            productRepo.save(new Product()
//                                .setName("Chocolate")
//                                .setPrice(BigDecimal.valueOf(1.50))
//                                .setQuantity(300)
//                                .setCategory(sweets));
//            productRepo.save(new Product()
//                                .setName("Detergent")
//                                .setPrice(BigDecimal.valueOf(0.99))
//                                .setQuantity(300)
//                                .setCategory(domestic));
//            productRepo.save(new Product()
//                                .setName("Motor Oil")
//                                .setPrice(BigDecimal.valueOf(19.99))
//                                .setQuantity(200)
//                                .setCategory(auto));
//
//            userService.saveRole(new Role(null,"ROLE_USER"));
//            userService.saveRole(new Role(null,"ROLE_MANAGER"));
//            userService.saveRole(new Role(null,"ROLE_ADMIN"));
//
//            userService.saveUser(new User(null,"John Doe","john","1234",new ArrayList<>()));
//            userService.saveUser(new User(null,"Jane Doe","jane","4321",new ArrayList<>()));
//            userService.saveUser(new User(null,"Justin Time","justin","12345",new ArrayList<>()));
//
//            userService.addRoleToUser("john","ROLE_USER");
//            userService.addRoleToUser("jane","ROLE_MANAGER");
//            userService.addRoleToUser("justin","ROLE_ADMIN");
//        };
//    }
}
