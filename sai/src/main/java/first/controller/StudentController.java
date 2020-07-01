package first.controller;

import first.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@PropertySource("classpath:")
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    HashMap<String, Object> listOfCountries;

    @RequestMapping("showForm")
    public String showForm(Model model){
        Student student = new Student();

        model.addAttribute("student", student);

        model.addAttribute("countries", listOfCountries);

        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute Student theStudent){
        return "student-accepted";
    }
}
