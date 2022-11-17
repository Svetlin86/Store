
// In this interface the functionalities of the application are defined

package projects.grocery.store.service;

import projects.grocery.store.model.Product;

import javax.validation.constraints.NotEmpty;
import java.util.Collection;

public interface ProductService {

    Product create (Product product); // Creates a product and saves in the database

    Product setQuantity (Product product , int quantity); // Sets product quantity

    Collection<Product> list(); // List all products

//    Product check (Product product ,int quantity); // Goes in the DB,find the product and check quantity, returns quantity

//    @NotEmpty (message = "Please specify the name of the product")
//    String get (String name); // Takes the name of the product that is to be found

    Product update (Product product); // Takes the product with the updated info and saves it in DB

    Boolean delete (Long id); // Goes in the DB finds the product by id and deletes it

}
