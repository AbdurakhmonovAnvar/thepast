package uz.anvar.thepast.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/user")
    public String showMainPage(Model model){

        return "index";
    }
}
