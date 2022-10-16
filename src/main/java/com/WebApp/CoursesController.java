package com.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CoursesController {


    @RequestMapping(value = "/courses",method = RequestMethod.GET)
    public String courses(){
        System.out.println("Welcome to Spring Web App");
        return "Courses";
    }

    //Getting the parameters from  the web via the jsp file(Method one)
    @RequestMapping("/person")
    public String _courses(String person,HttpServletRequest request){
        HttpSession session=request.getSession();
//       String cname=request.getParameter("cname");
        session.setAttribute("cname",person);
        System.out.println("Person is "+person);
        return "Person";
    }

}
