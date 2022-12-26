package pl.jiohim.recipeProject.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jiohim.recipeProject.services.StringService;

@Slf4j
@Controller
public class MainController {

    private final StringService stringService;

    public MainController(StringService stringService) {
        this.stringService = stringService;
    }

    @RequestMapping({"", "/"})
    public String showRecipe(Model model){
        log.debug("U r in show recipe method");

        model.addAttribute("recipes", stringService.getRecipes());

        return "index";
    }
}
