package pl.jiohim.recipeProject.services;

import org.springframework.stereotype.Service;
import pl.jiohim.recipeProject.domain.Recipe;
import pl.jiohim.recipeProject.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;


@Service
public class RecipeService implements StringService {

    private final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }


    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        repository.findAll().iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
