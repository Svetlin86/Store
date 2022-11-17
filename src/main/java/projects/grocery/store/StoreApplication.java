package projects.grocery.store;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projects.grocery.store.model.Product;
import projects.grocery.store.repo.ProductRepo;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


	@Bean
	CommandLineRunner run(ProductRepo productRepo) {
		return args -> {
			productRepo.save(new Product
					( null,"Cow meat",
							10.99,"FOOD",32));
			productRepo.save(new Product
					(null,"Marlboro",
							1.00,"CIGARETTES",77));
			productRepo.save(new Product
					(null,"Fanta",
							1.99,"BEVERAGE",67));
			productRepo.save(new Product
					(null,"Jack Daniels",
							75.00,"ALCOHOL",10));
		};
	}

}
