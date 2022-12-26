package pl.jiohim.recipeProject.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.jiohim.recipeProject.domain.Recipe;
import pl.jiohim.recipeProject.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeService implements StringService {

    private final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }


    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        repository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
