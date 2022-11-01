package pl.jiohim.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.recipeProject.domain.Category;
import pl.jiohim.recipeProject.domain.Recipe;

public interface CategoryRepository  extends CrudRepository<Category, Long> {
}
