package pl.jiohim.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jiohim.recipeProject.domain.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
