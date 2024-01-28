package com.example.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloConroller {
    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView view = new ModelAndView("Nehanth.html");
        return view;
    }
}
