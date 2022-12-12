package projects.grocery.store.service;

import projects.grocery.store.model.Category;
import java.util.List;
public interface CategoryService {
    Category create (Category category);
    List<Category> list(int limit);
    Category get(Long id);
    Category update (Category category);
    void delete (Long id);
}
