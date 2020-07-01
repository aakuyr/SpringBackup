package first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld";
    }

    @RequestMapping("processForm")
    public String processForm(){
        return "hello";
    }

    @RequestMapping({"trial","processFormUpperCase"})
    public String processFormUpperCase(@RequestParam String name, Model model){
        model.addAttribute("message", "HELLO " + name.toUpperCase());

        return "hello";
    }
}
