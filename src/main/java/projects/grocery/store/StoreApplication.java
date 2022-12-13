package projects.grocery.store;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import projects.grocery.store.model.Category;
import projects.grocery.store.model.Product;
import projects.grocery.store.repository.CategoryRepository;
import projects.grocery.store.repository.ProductRepository;
import projects.grocery.store.service.UserService;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }


    @Bean
    CommandLineRunner run(ProductRepository productRepo, CategoryRepository categoryRepo, UserService userService) {
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
            categoryRepo.save(
                    new Category()
                            .setName("SWEETS"));
            categoryRepo.save(
                    new Category()
                            .setName("DOMESTIC"));
            categoryRepo.save(
                    new Category()
                            .setName("AUTO"));

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
            Category sweets = categoryRepo
                    .findById(5L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));
            Category domestic = categoryRepo
                    .findById(6L)
                    .orElseThrow(() -> new IllegalArgumentException("not found"));
            Category auto = categoryRepo
                    .findById(7L)
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
                                .setName("Coca-Cola")
                                .setPrice(BigDecimal.valueOf(1.99))
                                .setQuantity(100)
                                .setCategory(beverages));
            productRepo.save(new Product()
                                .setName("Marlboro")
                                .setPrice(BigDecimal.valueOf(5.20))
                                .setQuantity(50)
                                .setCategory(cigarettes));
            productRepo.save(new Product()
                                .setName("Cheese")
                                .setPrice(BigDecimal.valueOf(17.99))
                                .setQuantity(90)
                                .setCategory(food));
            productRepo.save(new Product()
                                .setName("Vodka")
                                .setPrice(BigDecimal.valueOf(18.99))
                                .setQuantity(122)
                                .setCategory(alcohol));
            productRepo.save(new Product()
                                .setName("Chocolate")
                                .setPrice(BigDecimal.valueOf(1.50))
                                .setQuantity(300)
                                .setCategory(sweets));
            productRepo.save(new Product()
                                .setName("Detergent")
                                .setPrice(BigDecimal.valueOf(0.99))
                                .setQuantity(300)
                                .setCategory(domestic));
            productRepo.save(new Product()
                                .setName("Motor Oil")
                                .setPrice(BigDecimal.valueOf(19.99))
                                .setQuantity(200)
                                .setCategory(auto));

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
        };
    }
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Filename"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
