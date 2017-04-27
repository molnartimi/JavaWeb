package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import model.User;


@Controller
public class UserController {

    @GetMapping(value = "/signup")
    public ModelAndView signUpForm() {
        return new ModelAndView("signup", "user", new User());
    }

    @PostMapping(value = "/signup")
    public ModelAndView addUser(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("id", user.getID());
        return new ModelAndView("index", "user", model);
    }
}