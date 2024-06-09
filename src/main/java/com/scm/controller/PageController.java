package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.scm.forms.User_Form;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "surya");
        model.addAttribute("githublink", "https://github.com/surya3535");
        return "home";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        User_Form form = new User_Form();
        // form.setName("surya");
        // form.setEmail("surya2255@gmail.com");
        // form.setPassword("1235");
        // form.setPhoneNumber("12354869547");
        // form.setAbout("hi how are you bro nwoifhweohoghowhooerhoiiohhho!!!");
        model.addAttribute("userForm", form);
        return "register";
    }

    // save data in database
    @PostMapping("/do-register")
    public String do_Register(@ModelAttribute User_Form userForm) {
        System.out.println("do_Register page handler");
        System.out.println(userForm);
        // fetch data from form
        // validate data
        // save data database
        // send successfully massge to user
        // redirect to login page
        return "redirect:/register";
    }

}
