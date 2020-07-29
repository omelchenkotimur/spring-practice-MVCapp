package tamerlan.mvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String programmingLanguage(){
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
}
