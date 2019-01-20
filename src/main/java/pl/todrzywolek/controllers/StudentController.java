package pl.todrzywolek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.todrzywolek.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        System.out.println("student first name: " + student.getFirstName());
        System.out.println("student last name: " + student.getLastName());

        return "student-confirmation";
    }


}
