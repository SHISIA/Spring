package com.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CoursesController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String courses(){
        System.out.println("Welcome to Spring Web App");
        return "Courses";

    }
}
