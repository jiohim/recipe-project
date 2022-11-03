package pl.jiohim.recipeProject.services;

import pl.jiohim.recipeProject.domain.Recipe;

import java.util.Optional;
import java.util.Set;

public interface StringService {

    Set<Recipe> getRecipes();
}
