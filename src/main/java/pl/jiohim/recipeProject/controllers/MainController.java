package pl.jiohim.recipeProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jiohim.recipeProject.domain.Category;
import pl.jiohim.recipeProject.repositories.CategoryRepository;
import pl.jiohim.recipeProject.repositories.UnitOfMeasureRepository;
import pl.jiohim.recipeProject.services.RecipeService;
import pl.jiohim.recipeProject.services.StringService;

import java.util.Optional;

@Controller
public class MainController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public MainController(CategoryRepository categoryRepository,
                          UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/"})
    public String showRecipe(Model model){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        System.out.println("Cat id is:" + categoryOptional.get().getId());

       // model.addAttribute("recipe", stringService.randomRecipe(1));

        return "index";
    }
}
