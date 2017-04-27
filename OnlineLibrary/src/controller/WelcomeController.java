package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.enterprise.inject.Model;

@Controller
public class Router {

    @RequestMapping("/welcome")
	public ModelAndView index() {
        return new ModelAndView("welcome");
	}
	/*
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
	    return new ModelAndView("welcome");
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
        return new ModelAndView("login");
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration() {
        return new ModelAndView("registration");
	}*/
}
