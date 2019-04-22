package controllers;

import model.Condiment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/save")
public class CondimentSandwich {

    @GetMapping
    public String formSelect() {
    return "formSelect";
    }

    @PostMapping
    public ModelAndView result(@RequestParam("condiment") List<String> condiment){
       Condiment condiment1 = new Condiment();
       condiment1.setCondiment(condiment);

        ModelAndView modelAndView = new ModelAndView("resultSelect","con",condiment1);
        return modelAndView;
    }


}
