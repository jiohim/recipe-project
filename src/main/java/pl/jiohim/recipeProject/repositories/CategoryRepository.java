package pl.jiohim.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.recipeProject.domain.Category;
import pl.jiohim.recipeProject.domain.Recipe;

import java.util.Optional;

public interface CategoryRepository  extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
