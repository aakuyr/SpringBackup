package first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showString(){
        System.out.println("Hello World");
        return "main-menu";
    }
}
