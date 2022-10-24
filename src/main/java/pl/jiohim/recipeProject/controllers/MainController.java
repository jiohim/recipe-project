package pl.jiohim.recipeProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jiohim.recipeProject.services.RecipeService;
import pl.jiohim.recipeProject.services.StringService;

@Controller
public class MainController {
    private final StringService stringService;

    public MainController(StringService stringService) {
        this.stringService = stringService;
    }

    @RequestMapping({"", "/"})
    public String showRecipe(Model model){

        model.addAttribute("recipe", stringService.randomRecipe(1));

        return "index";
    }
}
