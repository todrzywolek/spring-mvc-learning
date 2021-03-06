package pl.todrzywolek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("processFormAndUpperCase")
    public String processAndUpperCaseFormData(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");

        model.addAttribute("message", "Yo " + studentName.toUpperCase() + "!");

        return "helloworld";
    }

    @RequestMapping("convertToUpperCaseWithRequestParam")
    public String upperCaseWithRequestParam(@RequestParam String studentName, Model model) {

        model.addAttribute("messageRP", "Hello " + studentName.toUpperCase() + "!");

        return "helloworld";
    }
}
