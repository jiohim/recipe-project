package pl.jiohim.recipeProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jiohim.recipeProject.domain.Category;
import pl.jiohim.recipeProject.domain.Recipe;
import pl.jiohim.recipeProject.repositories.CategoryRepository;
import pl.jiohim.recipeProject.repositories.UnitOfMeasureRepository;
import pl.jiohim.recipeProject.services.RecipeService;
import pl.jiohim.recipeProject.services.StringService;

import java.util.Optional;

@Controller
public class MainController {

    private final StringService stringService;

    public MainController(StringService stringService) {
        this.stringService = stringService;
    }

    @RequestMapping({"", "/"})
    public String showRecipe(Model model){

        model.addAttribute("recipes", stringService.getRecipes());

        return "index";
    }
}
