package projects.grocery.store.service;

import projects.grocery.store.model.Category;
import projects.grocery.store.model.Product;

import java.util.Collection;
import java.util.List;

public interface CategoryService {
    Category create (Category category); // Creates a product and saves in the database

    List<Category> list(int limit);

    Category get(Long id);

    Category update (Category category); // Takes the product with the updated info and saves it in DB

    void delete (Long id); // Goes in the DB finds the product by id and deletes it
}
