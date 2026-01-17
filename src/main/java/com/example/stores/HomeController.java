package com.example.stores;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Tells spring that this class should be used a web controller for
//controlling web traffic
@Controller
public class HomeController {
    @Value("${spring.application.name}") //Gets the value associated with this key and injects it into the variable at runtime
    private String appName;


    @RequestMapping("/")
    public String index(){
        System.out.println("appName: " + appName);
        return "index.html"; //Returns the "view" specified
    }

    private String getViewName(){
        return "index";
    }

}
