package projects.grocery.store.service.implementation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import projects.grocery.store.model.Category;
import projects.grocery.store.repository.CategoryRepository;
import projects.grocery.store.service.CategoryService;
import java.util.List;
@RequiredArgsConstructor
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepo;
    @Override
    public Category create(Category category) {
        log.info("Saving new category: {}",category.getName());
        return categoryRepo.save(category);
    }
    @Override
    public List<Category> list(int limit) {
        log.info("Listing all categories");
        return categoryRepo.findAll(PageRequest.of(0,limit)).toList();
    }
    @Override
    public Category get(Long id) {
        log.info("Fetching categories by id: {}", id);
        return categoryRepo.findById(id).orElseThrow(() -> new IllegalArgumentException( // TODO change exception
                String.format("Category with id: %d does not exist", id)));
    }
    @Override
    public Category update(Category category) {
        log.info("Updating category: {}",category.getName());
        return categoryRepo.save(category);
    }
    @Override
    public void delete(Long id) {
        log.info("Deleting category: {}", id);
        categoryRepo.deleteById(id);
    }
}
