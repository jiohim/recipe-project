package pl.jiohim.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.recipeProject.domain.Recipe;
import pl.jiohim.recipeProject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository  extends CrudRepository<UnitOfMeasure, Long> {
}
