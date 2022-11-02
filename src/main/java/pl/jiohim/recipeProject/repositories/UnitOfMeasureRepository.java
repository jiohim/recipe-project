package pl.jiohim.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jiohim.recipeProject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository  extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
