package tamerlan.mvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @GetMapping("/java")
    public String java() {
        return "first/java";
    }

    @GetMapping("/general-purpose")
    public String generalPurpose() {
        return "first/general-purpose";
    }

    @GetMapping("/Programming_language")
    public String programmingLanguage() {
        return "first/programming_language";
    }

    @GetMapping("/Class-based_programming")
    public String classBasedProgramming() {
        return "first/class-based_programming";
    }

    @GetMapping("/Object-oriented_programming")
    public String objectOrientedProgramming() {
        return "first/object-oriented_programming";
    }

    @GetMapping("/coupling")
    public String coupling() {
        return "first/coupling";
    }

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {

        //   System.out.println("Goodbye " + name + " " + surname);
        model.addAttribute("message", "Goodbye " + name + " " + surname);
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("x") int x,
                             @RequestParam("y") int y,
                             @RequestParam("operation") String operation,
                             Model model) {

        double result;

        switch (operation) {
            case "multiply":
                result = x * y;
                break;
            case "divide":
                result = x / (double)y;
                break;
            case "plus":
                result = x + y;
                break;
            case "minus":
                result = x - y;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);

        return "first/calculator";
    }
}
