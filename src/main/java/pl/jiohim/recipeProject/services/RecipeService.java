package pl.jiohim.recipeProject.services;

import org.springframework.stereotype.Service;
import pl.jiohim.recipeProject.dao.RecipeRepository;

import java.util.Optional;


@Service
public class RecipeService implements StringService{
    private final RecipeRepository repository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }


    public Optional randomRecipe(int id) {

        return null;//repository.findById(id);
    }
}
